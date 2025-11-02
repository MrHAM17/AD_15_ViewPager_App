## AD_15_ViewPager_App

### 📱 Short Description

Application demonstrating how to create **swipeable screens** or tabs using the modern **ViewPager 2** component combined with **Fragments** for navigational UI.

---

### 🧩 Concepts Covered

* **ViewPager 2** (UI widget for horizontal or vertical scrolling)
* **Fragments** (modular, swipeable UI sections)
* **Fragment State Adapter** (custom adapter for ViewPager 2)
* **Tab Layout** (visual tabs for navigation)
* **Tab Layout Mediator** (utility class for synchronizing Tab Layout and ViewPager 2)

---

### 🎯 Learning / Discovery Points

* Adding the necessary ViewPager 2 library dependency to the project.
* Creating an adapter that extends `FragmentStateAdapter` to manage the list of fragments.
* Setting the orientation (e.g., `ORIENTATION_HORIZONTAL`) for the ViewPager 2.
* Using the **`TabLayoutMediator`** instance to dynamically link the tabs and pages, ensuring that swiping updates the tabs and clicking tabs changes the page.

---

### ⚙️ App Features / Usage

* Displays three distinct fragments (Fragment 1, 2, 3).
* Allows horizontal swiping to navigate between fragments.
* Tabs displayed at the top allow immediate navigation to any fragment.

---

### 📝 Note

ViewPager combined with Fragments is essential for building complex apps with multiple sections or introductory guides/galleries that require smooth horizontal navigation.

---
