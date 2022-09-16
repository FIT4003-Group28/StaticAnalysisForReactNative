package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: akvs  reason: default package */
/* loaded from: classes.dex */
public final class akvs {
    public final Context a;
    public final snc b;
    public final akvr c;
    public final acrr d;
    public final int e;
    public final boolean f;
    public aphf g;
    private final akvq h;

    public akvs(Context context, snc sncVar, akvr akvrVar, acrr acrrVar, akvq akvqVar, akwr akwrVar) {
        this.a = context;
        this.b = sncVar;
        this.c = akvrVar;
        this.d = acrrVar;
        this.h = akvqVar;
        aver averVar = akwrVar.get().i;
        averVar = averVar == null ? aver.a : averVar;
        this.e = averVar.c;
        this.f = averVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.g = null;
        akvr akvrVar = this.c;
        if (akvrVar.a.delete() || !akvrVar.a.exists()) {
            return;
        }
        afus.b(2, 27, "Unable to delete journal file");
    }

    public final void b(aopa aopaVar, long j) {
        int i = ((aphf) aopaVar.instance).d;
        aopaVar.copyOnWrite();
        aphf aphfVar = (aphf) aopaVar.instance;
        aphfVar.b |= 2;
        aphfVar.d = (int) (i + j);
        if (this.h.c()) {
            int i2 = akvp.a;
            int i3 = ((aphf) aopaVar.instance).g;
            aopaVar.copyOnWrite();
            aphf aphfVar2 = (aphf) aopaVar.instance;
            aphfVar2.b |= 16;
            aphfVar2.g = (int) (i3 + j);
        }
        if (this.h.b()) {
            int i4 = akvp.a;
            int i5 = ((aphf) aopaVar.instance).h;
            aopaVar.copyOnWrite();
            aphf aphfVar3 = (aphf) aopaVar.instance;
            aphfVar3.b |= 32;
            aphfVar3.h = (int) (i5 + j);
        }
    }
}
