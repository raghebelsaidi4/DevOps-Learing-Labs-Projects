### **1. Install CentOS / RHEL**
To install CentOS or RHEL:
1. Download the CentOS/RHEL ISO from the official website.
2. Create a bootable USB using `dd` or tools like **Rufus**.
3. Boot from the USB and follow the installation steps.
4. Set up partitions, root password, and user accounts.
5. Complete the installation and reboot.

---

### **2. Difference between `cat` and `more`**
- `cat` (concatenate) displays the entire file at once.
- `more` displays the file **page by page**, allowing scrolling.

Example:
```sh
cat /etc/passwd   # Displays entire file at once
more /etc/passwd  # Shows page-by-page view
```

---

### **3. Difference between `rm` and `rmdir` using `man`**
- `rm` removes **files and directories** (including non-empty ones if `-r` is used).
- `rmdir` removes **only empty directories**.

Example:
```sh
man rm       # Shows manual for rm
man rmdir    # Shows manual for rmdir
```

---

### **4. Create the hierarchy under your home directory**
```sh
mkdir -p ~/dir1/dir11 ~/dir1/dir12 ~/docs
touch ~/dir1/dir11/file1 ~/docs/mycv
```

#### **a. Remove dir11 in one step**
```sh
rm -r ~/dir1/dir11
```
- If you try `rmdir dir11`, it fails because the directory is not empty.
- Using `rm -r` removes both the directory and its contents.

#### **b. Remove dir12 using `rmdir -p`**
```sh
rmdir -p ~/dir1/dir12
```
- If `dir12` is empty, `rmdir -p` also removes `dir1` (if empty).

#### **c. Absolute and relative path for `mycv`**
- **Absolute Path:** `/home/user/docs/mycv`
- **Relative Path:** `docs/mycv` (from `/home/user`)

---

### **5. Copy `/etc/passwd` to home as `mypasswd`**
```sh
cp /etc/passwd ~/mypasswd
```

---

### **6. Rename `mypasswd` to `oldpasswd`**
```sh
mv ~/mypasswd ~/oldpasswd
```

---

### **7. Four ways to go to your home directory from `/usr/bin`**
```sh
cd ~        # 1. Using tilde
cd          # 2. Just 'cd' with no arguments
cd $HOME    # 3. Using environment variable
cd /home/user  # 4. Using absolute path
```

---

### **8. List Linux commands in `/usr/bin` that start with "w"**
```sh
ls /usr/bin/w*
```

---

### **9. Display the first 4 lines of `/etc/passwd`**
```sh
head -n 4 /etc/passwd
```

---

### **10. Display the last 7 lines of `/etc/passwd`**
```sh
tail -n 7 /etc/passwd
```

---

### **11. Display `man` pages of `passwd` command and file sequentially**
```sh
man passwd; man 5 passwd
```
(`man passwd` is for the command, `man 5 passwd` is for the file.)

---

### **12. Display the `man` page of the `passwd` file**
```sh
man 5 passwd
```

---

### **13. Display all commands with "passwd" in their `man` pages**
```sh
 apropos passwd
```

---