package ezvcard.parameter;

import ezvcard.VCardVersion;
/* loaded from: classes.dex */
public class EmailType extends VCardParameter {
    private static final c<EmailType> p = new c<>(EmailType.class);
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: a  reason: collision with root package name */
    public static final EmailType f5527a = new EmailType("internet");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: b  reason: collision with root package name */
    public static final EmailType f5528b = new EmailType("x400");
    @ezvcard.c(a = {VCardVersion.V2_1, VCardVersion.V3_0})

    /* renamed from: c  reason: collision with root package name */
    public static final EmailType f5529c = new EmailType("pref");
    @ezvcard.c(a = {VCardVersion.V2_1})

    /* renamed from: d  reason: collision with root package name */
    public static final EmailType f5530d = new EmailType("aol");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType e = new EmailType("applelink");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType f = new EmailType("attmail");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType g = new EmailType("cis");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType h = new EmailType("eworld");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType i = new EmailType("ibmmail");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType j = new EmailType("mcimail");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType k = new EmailType("powershare");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType l = new EmailType("prodigy");
    @ezvcard.c(a = {VCardVersion.V2_1})
    public static final EmailType m = new EmailType("tlx");
    @ezvcard.c(a = {VCardVersion.V4_0})
    public static final EmailType n = new EmailType("home");
    @ezvcard.c(a = {VCardVersion.V4_0})
    public static final EmailType o = new EmailType("work");

    private EmailType(String str) {
        super(str);
    }

    public static EmailType a(String str) {
        return (EmailType) p.c(str);
    }
}
