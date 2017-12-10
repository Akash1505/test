from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome('/home/akash/Documents/chromedriver')
driver.get('https://github.com/login');

username = driver.find_element_by_id("login_field")
username.send_keys("hupareshubham@gmail.com")

username = driver.find_element_by_id("password")
username.send_keys("Shubham@123")

driver.find_element_by_name("commit").click()

# get initial window size
print driver.get_window_size()

# maximize window
driver.maximize_window()
print driver.get_window_size()


driver.get('https://google.com');
time.sleep(2000)
driver.navigate().refresh();

time.sleep(1000)

driver.quit()
