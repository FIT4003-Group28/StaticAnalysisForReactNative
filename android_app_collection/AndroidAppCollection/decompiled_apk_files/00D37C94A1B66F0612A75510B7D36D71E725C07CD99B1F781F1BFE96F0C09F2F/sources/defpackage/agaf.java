package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: agaf  reason: default package */
/* loaded from: classes.dex */
public final class agaf {
    public final yjl a;
    public final yjs b;
    private final axwt c;
    private final agfc d;

    public agaf(yjl yjlVar, axwt axwtVar, yjs yjsVar, agfc agfcVar) {
        this.a = yjlVar;
        this.c = axwtVar;
        this.b = yjsVar;
        this.d = agfcVar;
    }

    public final void a(final aoqu aoquVar) {
        Boolean bool;
        aqxe aqxeVar = this.c.a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45352805L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352805L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352805L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            agfc agfcVar = this.d;
            final String o = zhn.o();
            ylx.j(anii.h(anii.h(anii.h(agfcVar.a.b(new ampg() { // from class: agfa
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    String str = o;
                    aoqu aoquVar2 = aoquVar;
                    baqg baqgVar = (baqg) obj;
                    if (baqgVar.b.size() > 100) {
                        throw new IllegalStateException("Too many payloads");
                    }
                    aopa mo52toBuilder = baqgVar.mo52toBuilder();
                    aoob byteString = aoquVar2.toByteString();
                    str.getClass();
                    byteString.getClass();
                    mo52toBuilder.copyOnWrite();
                    ((baqg) mo52toBuilder.instance).a().put(str, byteString);
                    return (baqg) mo52toBuilder.mo39build();
                }
            }, anjk.a), new wdx(o, 19), anjk.a), new agae(aoquVar), anjk.a), new ampg() { // from class: agad
                @Override // defpackage.ampg
                public final Object apply(Object obj) {
                    agaf.this.b.e("notification_processing", 0L, false, 0, (Bundle) obj, null, false);
                    return true;
                }
            }, anjk.a), anjk.a, new ylv() { // from class: agac
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    agaf agafVar = agaf.this;
                    aoqu aoquVar2 = aoquVar;
                    afus.c(2, 7, "Scheduling notification processing failed", th);
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", aoquVar2.toByteArray());
                    bundle.putString("renderer_class_name", aoquVar2.getClass().getName());
                    agafVar.a.a("notification_processing", bundle);
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("com.google.android.libraries.youtube.notification.pref.notification_renderer", aoquVar.toByteArray());
        bundle.putString("renderer_class_name", aoquVar.getClass().getName());
        this.a.a("notification_processing", bundle);
    }
}
