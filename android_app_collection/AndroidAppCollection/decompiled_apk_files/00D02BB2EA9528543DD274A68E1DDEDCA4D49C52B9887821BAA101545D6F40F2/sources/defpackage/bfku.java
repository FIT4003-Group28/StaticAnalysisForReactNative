package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfku  reason: default package */
/* loaded from: classes3.dex */
public class bfku extends bfkr {
    private final bmdz a;
    private final bflb b;

    public bfku(Activity activity, cjqy cjqyVar, bhat bhatVar, btvo btvoVar, bbut bbutVar, bflb bflbVar, bwsh bwshVar, bvrb bvrbVar, cqhn cqhnVar, dxio<apqd> dxioVar, bvjj bvjjVar, bvpe bvpeVar, huc hucVar, bmdy bmdyVar, bmdz bmdzVar) {
        this(null, dbpy.a, activity, cjqyVar, bhatVar, btvoVar, bbutVar, bflbVar, bwshVar, bvrbVar, cqhnVar, dxioVar, bvjjVar, bvpeVar, hucVar, bmdyVar, bmdzVar);
    }

    @Override // defpackage.bfkr
    protected final List<jbp> g(ilo iloVar, List<dwfl> list) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (dwfl dwflVar : list) {
            arrayList.add(this.b.a(dwflVar, i, iloVar, this.a, L(dwflVar), true, null));
            i++;
        }
        return arrayList;
    }

    public bfku(@dzsi ckql ckqlVar, dbsg<bfke> dbsgVar, Activity activity, cjqy cjqyVar, bhat bhatVar, btvo btvoVar, bbut bbutVar, bflb bflbVar, bwsh bwshVar, bvrb bvrbVar, cqhn cqhnVar, dxio<apqd> dxioVar, bvjj bvjjVar, bvpe bvpeVar, huc hucVar, bmdy bmdyVar, bmdz bmdzVar) {
        super(null, null, dbsgVar, activity, cjqyVar, bhatVar, btvoVar, bbutVar, bflbVar, bwshVar, bvrbVar, cqhnVar, dxioVar, bvjjVar, bvpeVar, hucVar, bmdyVar);
        this.b = bflbVar;
        this.a = bmdzVar;
    }
}
