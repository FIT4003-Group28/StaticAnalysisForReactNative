package defpackage;

import j$.util.Optional;
/* compiled from: PG */
/* renamed from: oim  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class oim implements axnm {
    private final /* synthetic */ int d;
    public static final /* synthetic */ oim c = new oim(2);
    public static final /* synthetic */ oim b = new oim(1);
    public static final /* synthetic */ oim a = new oim();

    private /* synthetic */ oim() {
    }

    private /* synthetic */ oim(int i) {
        this.d = i;
    }

    @Override // defpackage.axnm
    public final Object get() {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return Optional.empty();
            }
            uzs c2 = uzt.c();
            c2.b(true);
            return c2.a();
        }
        return amyg.a;
    }
}
