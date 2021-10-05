/************************************************************************
 * File: FacesConfigHelper.java 
 * 
 * Note: switch to Jakarta EE 9 namespace
 *
 * @author Mike Norman normanm@algonquincollege.com
 */
package jakartaee.examples.jsf.hello;

import jakarta.faces.annotation.FacesConfig;
import jakarta.faces.annotation.FacesConfig.Version;

@FacesConfig(
  // JSF 2.3 is configured 'out-of-the-box' to be backwards-compatible with 2.2
  // so if you want 2.3 features, you must *explicitly* configure it with the
  // @FacesConfig annotation and Version.JSF_2_3 constant
version = Version.JSF_2_3)
public class FacesConfigHelper {
}