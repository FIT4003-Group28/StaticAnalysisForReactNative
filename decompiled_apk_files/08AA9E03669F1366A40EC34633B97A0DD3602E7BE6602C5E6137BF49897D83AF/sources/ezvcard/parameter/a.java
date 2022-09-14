package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Collection;
/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public class a extends VCardParameter {
    private static final c<a> f = new c<>(a.class);
    @ezvcard.c(a = {VCardVersion.V2_1})

    /* renamed from: a  reason: collision with root package name */
    public static final a f5569a = new a("QUOTED-PRINTABLE", true);
    @ezvcard.c(a = {VCardVersion.V2_1})

    /* renamed from: b  reason: collision with root package name */
    public static final a f5570b = new a("BASE64", true);
    @ezvcard.c(a = {VCardVersion.V2_1})

    /* renamed from: c  reason: collision with root package name */
    public static final a f5571c = new a("8BIT", true);
    @ezvcard.c(a = {VCardVersion.V2_1})

    /* renamed from: d  reason: collision with root package name */
    public static final a f5572d = new a("7BIT", true);
    @ezvcard.c(a = {VCardVersion.V3_0})
    public static final a e = new a("b");

    private a(String str) {
        super(str);
    }

    private a(String str, boolean z) {
        super(str, z);
    }

    public static a a(String str) {
        return (a) f.b(str);
    }

    public static a b(String str) {
        return (a) f.c(str);
    }

    public static Collection<a> a() {
        return f.a();
    }
}
