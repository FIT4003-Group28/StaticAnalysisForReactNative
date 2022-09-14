package com.google.android.apps.gmm.car.api;
/* compiled from: PG */
@btsb
@ckol(a = "car-projection")
/* loaded from: classes.dex */
public class GmmCarProjectionStateEvent {
    @dzsi
    private final jzp carInputInfo;
    @dzsi
    private final String headUnitMake;
    @dzsi
    private final String headUnitModel;
    @dzsi
    private final String headUnitSoftwareBuild;
    @dzsi
    private final String headUnitSoftwareVersion;
    private final boolean inProjectedMode;
    private final int locationCharacterization;
    @dzsi
    private final String manufacturer;
    @dzsi
    private final String model;
    @dzsi
    private final String modelYear;

    public GmmCarProjectionStateEvent(boolean z) {
        this(z, null, null, null, null, null, null, null, 0, null);
    }

    public GmmCarProjectionStateEvent(@ckoo(a = "projecting") boolean z, @dzsi @ckoo(a = "manufacturer") String str, @dzsi @ckoo(a = "model") String str2, @dzsi @ckoo(a = "model-year") String str3, @dzsi @ckoo(a = "head-unit-make") String str4, @dzsi @ckoo(a = "head-unit-model") String str5, @dzsi @ckoo(a = "head-unit-sw-ver") String str6, @dzsi @ckoo(a = "head-unit-sw-build") String str7, @ckoo(a = "loc-character", b = "0") int i) {
        this.inProjectedMode = z;
        this.manufacturer = str;
        this.model = str2;
        this.modelYear = str3;
        this.headUnitMake = str4;
        this.headUnitModel = str5;
        this.headUnitSoftwareVersion = str6;
        this.headUnitSoftwareBuild = str7;
        this.locationCharacterization = i;
        this.carInputInfo = null;
    }

    public GmmCarProjectionStateEvent(boolean z, @dzsi String str, @dzsi String str2, @dzsi String str3, @dzsi String str4, @dzsi String str5, @dzsi String str6, @dzsi String str7, int i, @dzsi jzp jzpVar) {
        this.inProjectedMode = z;
        this.manufacturer = str;
        this.model = str2;
        this.modelYear = str3;
        this.headUnitMake = str4;
        this.headUnitModel = str5;
        this.headUnitSoftwareVersion = str6;
        this.headUnitSoftwareBuild = str7;
        this.locationCharacterization = i;
        this.carInputInfo = jzpVar;
    }

    @dzsi
    public jzp getCarInputInfo() {
        return this.carInputInfo;
    }

    @ckom(a = "head-unit-make")
    @dzsi
    public String getHeadUnitMake() {
        return this.headUnitMake;
    }

    @ckom(a = "head-unit-model")
    @dzsi
    public String getHeadUnitModel() {
        return this.headUnitModel;
    }

    @ckom(a = "head-unit-sw-build")
    @dzsi
    public String getHeadUnitSoftwareBuild() {
        return this.headUnitSoftwareBuild;
    }

    @ckom(a = "head-unit-sw-ver")
    @dzsi
    public String getHeadUnitSoftwareVersion() {
        return this.headUnitSoftwareVersion;
    }

    @ckom(a = "loc-character")
    public int getLocationCharacterization() {
        return this.locationCharacterization;
    }

    @ckom(a = "manufacturer")
    @dzsi
    public String getManufacturer() {
        return this.manufacturer;
    }

    @ckom(a = "model")
    @dzsi
    public String getModel() {
        return this.model;
    }

    @ckom(a = "model-year")
    @dzsi
    public String getModelYear() {
        return this.modelYear;
    }

    public boolean hasCarInputInfo() {
        return getCarInputInfo() != null;
    }

    @ckon(a = "head-unit-make")
    public boolean hasHeadUnitMake() {
        return getHeadUnitMake() != null;
    }

    @ckon(a = "head-unit-model")
    public boolean hasHeadUnitModel() {
        return getHeadUnitModel() != null;
    }

    @ckon(a = "head-unit-sw-build")
    public boolean hasHeadUnitSoftwareBuild() {
        return getHeadUnitSoftwareBuild() != null;
    }

    @ckon(a = "head-unit-sw-ver")
    public boolean hasHeadUnitSoftwareVersion() {
        return getHeadUnitSoftwareVersion() != null;
    }

    @ckon(a = "manufacturer")
    public boolean hasManufacturer() {
        return getManufacturer() != null;
    }

    @ckon(a = "model")
    public boolean hasModel() {
        return getModel() != null;
    }

    @ckon(a = "model-year")
    public boolean hasModelYear() {
        return getModelYear() != null;
    }

    @ckom(a = "projecting")
    public boolean isInProjectedMode() {
        return this.inProjectedMode;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.h("inProjectedMode", this.inProjectedMode);
        b.b("manufacturer", this.manufacturer);
        b.b("model", this.model);
        b.b("modelYear", this.modelYear);
        b.b("headUnitMake", this.headUnitMake);
        b.b("headUnitModel", this.headUnitModel);
        b.b("headUnitSoftwareVersion", this.headUnitSoftwareVersion);
        b.b("headUnitSoftwareBuild", this.headUnitSoftwareBuild);
        b.f("locationCharacterization", this.locationCharacterization);
        b.b("carInputInfo", this.carInputInfo);
        return b.toString();
    }

    public GmmCarProjectionStateEvent(boolean z, int i) {
        this(z, null, null, null, null, null, null, null, i, null);
    }
}
