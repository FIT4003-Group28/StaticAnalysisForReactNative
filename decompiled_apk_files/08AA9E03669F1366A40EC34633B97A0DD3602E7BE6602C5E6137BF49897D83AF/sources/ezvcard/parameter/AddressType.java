package ezvcard.parameter;

import ezvcard.VCardVersion;
/* loaded from: classes.dex */
public class AddressType extends VCardParameter {
    private static final c<AddressType> h = new c<>(AddressType.class);

    /* renamed from: a  reason: collision with root package name */
    public static final AddressType f5521a = new AddressType("home");

    /* renamed from: b  reason: collision with root package name */
    public static final AddressType f5522b = new AddressType("work");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: c  reason: collision with root package name */
    public static final AddressType f5523c = new AddressType("dom");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: d  reason: collision with root package name */
    public static final AddressType f5524d = new AddressType("intl");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType e = new AddressType("postal");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType f = new AddressType("parcel");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final AddressType g = new AddressType("pref");

    private AddressType(String str) {
        super(str);
    }

    public static AddressType a(String str) {
        return (AddressType) h.c(str);
    }
}
