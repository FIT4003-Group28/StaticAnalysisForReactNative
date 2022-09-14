package ezvcard.parameter;

import java.util.Collection;
/* loaded from: classes.dex */
public class Calscale extends VCardParameter {

    /* renamed from: b  reason: collision with root package name */
    private static final c<Calscale> f5526b = new c<>(Calscale.class);

    /* renamed from: a  reason: collision with root package name */
    public static final Calscale f5525a = new Calscale("gregorian");

    private Calscale(String str) {
        super(str);
    }

    public static Calscale a(String str) {
        return (Calscale) f5526b.b(str);
    }

    public static Calscale b(String str) {
        return (Calscale) f5526b.c(str);
    }

    public static Collection<Calscale> a() {
        return f5526b.a();
    }
}
