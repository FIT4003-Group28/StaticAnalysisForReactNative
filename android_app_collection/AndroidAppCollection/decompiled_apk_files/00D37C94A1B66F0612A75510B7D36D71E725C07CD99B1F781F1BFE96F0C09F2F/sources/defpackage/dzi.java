package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: dzi  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzi implements azqb {
    public final /* synthetic */ dzs a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzi(dzs dzsVar, int i) {
        this.b = i;
        this.a = dzsVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (aktk) this.a.z.get();
            }
            return new akwk((SharedPreferences) this.a.an.get());
        }
        return new akwj(this.a.aF);
    }
}
