package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: aybg  reason: default package */
/* loaded from: classes3.dex */
public final class aybg implements Comparator<akqq> {
    @dzsi
    private final GmmLocation a;

    public aybg(@dzsi GmmLocation gmmLocation) {
        this.a = gmmLocation;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(akqq akqqVar, akqq akqqVar2) {
        akqq akqqVar3 = akqqVar;
        akqq akqqVar4 = akqqVar2;
        GmmLocation gmmLocation = this.a;
        if (gmmLocation == null) {
            return 0;
        }
        if (akqqVar3 != null && akqqVar4 != null) {
            return Float.valueOf(gmmLocation.F(akqqVar3)).compareTo(Float.valueOf(this.a.F(akqqVar4)));
        }
        if (akqqVar3 == null && akqqVar4 == null) {
            return 0;
        }
        return akqqVar3 != null ? -1 : 1;
    }
}
