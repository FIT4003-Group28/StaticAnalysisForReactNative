package defpackage;
/* compiled from: PG */
/* renamed from: afae  reason: default package */
/* loaded from: classes.dex */
public final class afae {
    public static final afae a = new afae(null, null);
    public final afad b;
    public final afad c;
    public final amuk d;

    public afae(afad afadVar, afad afadVar2) {
        this.b = afadVar;
        this.c = afadVar2;
        amuf h = amuk.h(2);
        if (afadVar != null) {
            h.h(orl.TRACK_TYPE_AUDIO);
        }
        if (afadVar2 != null) {
            h.h(orl.TRACK_TYPE_VIDEO);
        }
        this.d = h.g();
    }

    public final pvf a(orl orlVar) {
        afad afadVar;
        afad afadVar2;
        if (orlVar != orl.TRACK_TYPE_AUDIO || (afadVar2 = this.b) == null) {
            if (orlVar == orl.TRACK_TYPE_VIDEO && (afadVar = this.c) != null) {
                return afadVar.f();
            }
            return null;
        }
        return afadVar2.f();
    }
}
