package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bayi  reason: default package */
/* loaded from: classes3.dex */
public final class bayi implements Comparator<bayj> {
    private final GmmLocation a;

    public bayi(GmmLocation gmmLocation) {
        this.a = gmmLocation;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(bayj bayjVar, bayj bayjVar2) {
        akqq q = bayjVar.q();
        dbsk.s(q);
        akqq q2 = bayjVar2.q();
        dbsk.s(q2);
        return Float.valueOf(this.a.F(q)).compareTo(Float.valueOf(this.a.F(q2)));
    }
}
