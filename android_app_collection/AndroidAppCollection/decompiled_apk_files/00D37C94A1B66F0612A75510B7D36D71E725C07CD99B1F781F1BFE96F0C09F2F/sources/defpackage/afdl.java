package defpackage;

import java.util.Collections;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afdl  reason: default package */
/* loaded from: classes.dex */
public final class afdl implements otm {
    Set b;
    Set c;
    boolean d;
    aegv e;
    private int f;

    @Override // defpackage.otm
    public final osv a(String str, boolean z) {
        Set emptySet = this.f == 3 ? this.b : Collections.emptySet();
        int i = aegv.NONE.d;
        if (this.d && pwl.l(str)) {
            i = this.e.d;
        }
        return afmg.c(str, z, this.c, emptySet, i);
    }

    public final void b(int i, Set set, Set set2, boolean z, aegv aegvVar) {
        this.f = i;
        this.b = set;
        this.c = set2;
        this.d = z;
        this.e = aegvVar;
    }
}
