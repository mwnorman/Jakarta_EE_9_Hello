/************************************************************************
 * File: HelloManagedBean.java 
 * 
 * Note: switch to Jakarta EE 9 namespace
 *
 * @author Mike Norman normanm@algonquincollege.com
 */
package jakartaee.examples.jsf.hello;

import java.io.Serializable;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * A (new Jakarta EE 9) Request-scoped Managed Bean with injected FacesContext
 * 
 * @author Mike Norman (normanm@algonquincollege.com)
 */
@Named
@RequestScoped
public class HelloManagedBean implements Serializable {
    
    /**
     * Stores the FacesContext.
     */
    @Inject
    private FacesContext facesContext;
    
    /**
     * Get the FacesContext.
     * 
     * @return the FacesContext.
     */
    public FacesContext getFacesContext() {
        return facesContext;
    }
}
