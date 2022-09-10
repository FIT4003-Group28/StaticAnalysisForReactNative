package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crsa  reason: default package */
/* loaded from: classes5.dex */
public final class crsa<T> extends btrh<T> {
    public crsa(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        crry peek;
        crrz crrzVar = (crrz) this.a;
        GmmLocation a = ((amqo) obj).a();
        if (a == null || !a.hasSpeed()) {
            return;
        }
        long e = crrzVar.b.e();
        float speed = a.getSpeed();
        synchronized (crrzVar.c) {
            crrzVar.c.add(new crry(e, speed));
            crrzVar.f += speed;
            long j = e - crrzVar.d;
            while (!crrzVar.c.isEmpty() && (peek = crrzVar.c.peek()) != null && peek.a < j) {
                crrzVar.c.poll();
                crrzVar.f -= peek.b;
                crrzVar.e = true;
            }
            if (crrzVar.e && crrzVar.c.size() >= 10) {
                crsb crsbVar = crrzVar.g;
                float size = crrzVar.f / crrzVar.c.size();
                amvu amvuVar = a.l;
                dqvj dqvjVar = amvuVar != null ? amvuVar.m : dqvj.DRIVE;
                crsc crscVar = crsbVar.a;
                if (dqvjVar == dqvj.WALK && size > 9.722222f && !crscVar.b) {
                    crscVar.b = true;
                    crscVar.a.b(new crsg(dqvj.DRIVE));
                }
            }
        }
    }
}
