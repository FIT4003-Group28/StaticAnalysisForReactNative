package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aigt  reason: default package */
/* loaded from: classes2.dex */
public final class aigt implements aihd {
    private static final eaow e = eaow.a(1);
    final eapd a;
    final eaow b = e;
    final PersonId c;
    final ailp d;

    public aigt(ailp ailpVar, eapd eapdVar, PersonId personId) {
        this.d = ailpVar;
        this.a = eapdVar;
        this.c = personId;
    }

    public static aigt a(ailr ailrVar) {
        eapd eapdVar = new eapd(ailrVar.b);
        ajja ajjaVar = ailrVar.c;
        if (ajjaVar == null) {
            ajjaVar = ajja.d;
        }
        PersonId j = PersonId.j(ajjaVar);
        dbsk.s(j);
        ailp b = ailp.b(ailrVar.d);
        if (b == null) {
            b = ailp.TYPE_UNSPECIFIED;
        }
        return new aigt(b, eapdVar, j);
    }

    @Override // defpackage.aihd
    public final eapd d() {
        return this.a;
    }

    @Override // defpackage.aihd
    public final eaow e() {
        return this.b;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof aigt)) {
            return false;
        }
        aigt aigtVar = (aigt) obj;
        return dbsd.a(this.b, aigtVar.b) && dbsd.a(this.a, aigtVar.a) && dbsd.a(this.c, aigtVar.c) && dbsd.a(this.d, aigtVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }
}
