# AndroidBasicLibs

Add it in your root build.gradle at the end of repositories:
 ```
  allprojects {
  	repositories {
		...
		maven { 
			url 'https://jitpack.io' 
		}
	}
}
   ```
  Add the dependency：
   ```
  dependencies {
         compile 'com.github.Duanjiadong.AndroidBasicDJD:base:1.0'
  }
   ```
     Add the AndroidManifes:
  ```

      <application
        >
        ....
              <meta-data
              android:name="design_width"
              android:value="1280" />
          <meta-data
              android:name="design_height"
              android:value="800" />
      </application>

  </manifest>

  ```
  build.gradle:

  ```
  build.gradle
   defaultConfig {
          minSdkVersion 19
          ....
          ｝
  ```
