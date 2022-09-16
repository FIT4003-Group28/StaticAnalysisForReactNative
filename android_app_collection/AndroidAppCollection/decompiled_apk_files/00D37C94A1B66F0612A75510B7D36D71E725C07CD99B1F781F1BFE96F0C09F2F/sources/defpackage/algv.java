package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: algv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class algv implements anir {
    public final /* synthetic */ alhc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ algt c;
    public final /* synthetic */ algr d;
    private final /* synthetic */ int e;

    public /* synthetic */ algv(alhc alhcVar, String str, algt algtVar, algr algrVar) {
        this.a = alhcVar;
        this.b = str;
        this.c = algtVar;
        this.d = algrVar;
    }

    public /* synthetic */ algv(alhc alhcVar, String str, algt algtVar, algr algrVar, int i) {
        this.e = i;
        this.a = alhcVar;
        this.b = str;
        this.c = algtVar;
        this.d = algrVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.e == 0) {
            return this.a.b((List) obj, this.b, this.c, this.d);
        }
        return this.a.b(Collections.singleton((alhe) obj), this.b, this.c, this.d);
    }
}
