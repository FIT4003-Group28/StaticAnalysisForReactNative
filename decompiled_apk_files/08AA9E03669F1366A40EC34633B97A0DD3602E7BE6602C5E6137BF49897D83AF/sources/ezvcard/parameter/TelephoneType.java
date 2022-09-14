package ezvcard.parameter;

import ezvcard.VCardVersion;
import org.spongycastle.i18n.TextBundle;
/* loaded from: classes.dex */
public class TelephoneType extends VCardParameter {
    private static final c<TelephoneType> q = new c<>(TelephoneType.class);
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: a  reason: collision with root package name */
    public static final TelephoneType f5563a = new TelephoneType("bbs");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: b  reason: collision with root package name */
    public static final TelephoneType f5564b = new TelephoneType("car");

    /* renamed from: c  reason: collision with root package name */
    public static final TelephoneType f5565c = new TelephoneType("cell");

    /* renamed from: d  reason: collision with root package name */
    public static final TelephoneType f5566d = new TelephoneType("fax");
    public static final TelephoneType e = new TelephoneType("home");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType f = new TelephoneType("isdn");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType g = new TelephoneType("modem");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType h = new TelephoneType("msg");
    public static final TelephoneType i = new TelephoneType("pager");
    @ezvcard.c(a = {VCardVersion.V3_0})
    public static final TelephoneType j = new TelephoneType("pcs");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})
    public static final TelephoneType k = new TelephoneType("pref");
    @ezvcard.c(a = {VCardVersion.V4_0})
    public static final TelephoneType l = new TelephoneType(TextBundle.TEXT_ENTRY);
    @ezvcard.c(a = {VCardVersion.V4_0})
    public static final TelephoneType m = new TelephoneType("textphone");
    public static final TelephoneType n = new TelephoneType("video");
    public static final TelephoneType o = new TelephoneType("voice");
    public static final TelephoneType p = new TelephoneType("work");

    private TelephoneType(String str) {
        super(str);
    }

    public static TelephoneType a(String str) {
        return (TelephoneType) q.c(str);
    }
}
