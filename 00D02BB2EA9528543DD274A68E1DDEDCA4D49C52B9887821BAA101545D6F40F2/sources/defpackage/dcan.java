package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcan  reason: default package */
/* loaded from: classes5.dex */
final class dcan extends dbxi<Map.Entry> {
    final /* synthetic */ dcao a;
    private int b = -1;
    private final int c;

    public dcan(dcao dcaoVar) {
        this.a = dcaoVar;
        this.c = dcaoVar.a().size();
    }

    @Override // defpackage.dbxi
    protected final /* bridge */ /* synthetic */ Map.Entry a() {
        int i = this.b;
        while (true) {
            this.b = i + 1;
            int i2 = this.b;
            if (i2 < this.c) {
                Object b = this.a.b(i2);
                if (b != null) {
                    dcao dcaoVar = this.a;
                    return dcjz.p(dcaoVar.a().keySet().v().get(this.b), b);
                }
                i = this.b;
            } else {
                return b();
            }
        }
    }
}
