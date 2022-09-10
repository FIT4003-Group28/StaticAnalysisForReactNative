package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byof  reason: default package */
/* loaded from: classes4.dex */
public final class byof {
    public final btvo a;
    public final ahtd b;
    public final ahth c;
    public final ckcw d;
    private final cqat e;

    public byof(btvo btvoVar, ahtd ahtdVar, ahth ahthVar, cqat cqatVar, ckcw ckcwVar) {
        this.a = btvoVar;
        this.b = ahtdVar;
        this.c = ahthVar;
        this.e = cqatVar;
        this.d = ckcwVar;
    }

    public final long a(@dzsi GmmLocation gmmLocation) {
        if (gmmLocation == null || !gmmLocation.c) {
            return -1L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(this.e.b() - gmmLocation.getTime());
    }
}
