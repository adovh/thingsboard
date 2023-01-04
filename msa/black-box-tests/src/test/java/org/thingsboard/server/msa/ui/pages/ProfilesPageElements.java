/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.msa.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProfilesPageElements extends OtherPageElementsHelper {
    public ProfilesPageElements(WebDriver driver) {
        super(driver);
    }

    private static final String CREATE_DEVICE_PROFILE_BTN = "//span[text()='Create new device profile']";
    private static final String IMPORT_PROFILE_BTN = "//span[text()='Import device profile']";
    private static final String ADD_DEVICE_PROFILE_VIEW = "//tb-add-device-profile-dialog";
    private static final String DEVICE_PROFILE_VIEW = "//tb-entity-details-panel";
    private static final String NAME_FIELD = "//input[@formcontrolname='name']";
    private static final String RULE_CHAIN_FIELD = "//input[@formcontrolname='ruleChainId']";
    private static final String DASHBOARD_FIELD = "//input[@formcontrolname='dashboard']";
    private static final String QUEUE_FIELD = "//input[@formcontrolname='queueName']";
    private static final String DESCRIPTION_FIELD = "//textarea[@formcontrolname='description']";
    private static final String ADD_DEVICE_PROFILE_ADD_BTN = ADD_DEVICE_PROFILE_VIEW + "//span[text() = 'Add']/..";
    private static final String DEVISE_PROFILE_VIEW_DELETE_BTN = "//tb-device-profile//span[contains(text(),'Delete')]";
    private static final String PROFILE_NAMES = "//tbody/mat-row/mat-cell[contains(@class,'name')]";

    protected String getDeviseProfileViewDeleteBtn() {
        return DEVISE_PROFILE_VIEW_DELETE_BTN;
    }

    public WebElement createNewDeviceProfileBtn() {
        return waitUntilElementToBeClickable(CREATE_DEVICE_PROFILE_BTN);
    }

    public WebElement importDeviceProfileBtn() {
        return waitUntilElementToBeClickable(IMPORT_PROFILE_BTN);
    }

    public WebElement addDeviceProfileView() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_VIEW);
    }

    public WebElement addDeviceProfileNameField() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_VIEW + NAME_FIELD);
    }

    public WebElement profileViewNameField() {
        return waitUntilVisibilityOfElementLocated(DEVICE_PROFILE_VIEW + NAME_FIELD);
    }

    public WebElement addDeviceProfileRuleChainField() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_VIEW + RULE_CHAIN_FIELD);
    }

    public WebElement profileViewRuleChainField() {
        return waitUntilVisibilityOfElementLocated(DEVICE_PROFILE_VIEW + RULE_CHAIN_FIELD);
    }

    public WebElement addDeviceProfileMobileDashboardField() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_VIEW + DASHBOARD_FIELD);
    }

    public WebElement profileViewMobileDashboardField() {
        return waitUntilVisibilityOfElementLocated(DEVICE_PROFILE_VIEW + DASHBOARD_FIELD);
    }

    public WebElement addDeviceProfileQueueField() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_VIEW + QUEUE_FIELD);
    }

    public WebElement profileViewQueueField() {
        return waitUntilVisibilityOfElementLocated(DEVICE_PROFILE_VIEW + QUEUE_FIELD);
    }

    public WebElement addDeviceDescriptionField() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_VIEW + DESCRIPTION_FIELD);
    }

    public WebElement profileViewDescriptionField() {
        return waitUntilVisibilityOfElementLocated(DEVICE_PROFILE_VIEW + DESCRIPTION_FIELD);
    }

    public WebElement addDeviceProfileAddBtn() {
        return waitUntilElementToBeClickable(ADD_DEVICE_PROFILE_ADD_BTN);
    }

    public WebElement deviceProfileViewDeleteBtn() {
        return waitUntilElementToBeClickable(DEVISE_PROFILE_VIEW_DELETE_BTN);
    }

    public List<WebElement> profileNames() {
        return waitUntilElementsToBeClickable(PROFILE_NAMES);
    }
}