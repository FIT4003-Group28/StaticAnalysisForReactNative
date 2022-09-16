package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aoqe  reason: default package */
/* loaded from: classes2.dex */
public class aoqe extends aorg {
    private final dcdc<dcdc<jbf>> b;
    private final aoqy c;
    private final jib d;

    public aoqe(final anpa anpaVar, aofn aofnVar, Application application, dzsj<jkf> dzsjVar, anpc anpcVar, apjv apjvVar) {
        super(application, anpaVar, dzsjVar);
        dcdc<duzg> a = aofnVar.a();
        dccx F = dcdc.F();
        int size = a.size();
        final int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dccx F2 = dcdc.F();
            for (duze duzeVar : a.get(i2).a) {
                final dqjl b = dqjl.b(duzeVar.a);
                if (b == null) {
                    b = dqjl.UNKNOWN_ACTIVITY_TYPE;
                }
                String str = duzeVar.b;
                ixw ixwVar = new ixw();
                ixwVar.f = cjtd.a(dtyi.Q);
                ixwVar.a = str;
                ixwVar.e = new Runnable(anpaVar, b, i) { // from class: aoqd
                    private final anpa a;
                    private final dqjl b;
                    private final int c;

                    {
                        this.a = anpaVar;
                        this.b = b;
                        this.c = i;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        anpa anpaVar2 = this.a;
                        dqjl dqjlVar = this.b;
                        int i3 = this.c;
                        dnql bZ = dnqm.c.bZ();
                        dnqn bZ2 = dnqo.c.bZ();
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dnqo dnqoVar = (dnqo) bZ2.b;
                        dnqoVar.a |= 1;
                        dnqoVar.b = i3;
                        dnqo bK = bZ2.bK();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnqm dnqmVar = (dnqm) bZ.b;
                        bK.getClass();
                        dnqmVar.b = bK;
                        dnqmVar.a = 1;
                        anpaVar2.a.d(anpaVar2.g, dqjlVar, bZ.bK(), anpaVar2.o());
                    }
                };
                ixwVar.g = anpc.a(b);
                ixwVar.d = cqkp.T;
                F2.g(ixwVar.a());
                i++;
            }
            F.g(F2.f());
        }
        this.b = F.f();
        this.c = new aoqy(application, anpaVar);
        this.d = apjvVar.a().b();
    }

    @Override // defpackage.aorf
    /* renamed from: a */
    public aoqy h() {
        return this.c;
    }

    @Override // defpackage.anrm
    public cqsn c() {
        return cqrt.l(R.string.SEGMENT_EDITING_CHOOSE_ACTIVITY);
    }

    @Override // defpackage.aorf
    public List<dcdc<jbf>> d() {
        return this.b;
    }

    @Override // defpackage.aorf
    public List<jbf> e() {
        return dcdc.e();
    }

    @Override // defpackage.aorf
    public jib f() {
        return this.d;
    }

    @Override // defpackage.aorf
    public Boolean g() {
        return false;
    }

    public aoqe(dvay dvayVar, dpop dpopVar, aoge aogeVar, boolean z, anpb anpbVar, anpc anpcVar, Application application, dzsj<jkf> dzsjVar, apjv apjvVar) {
        this(anpbVar.a(dvayVar, dpopVar, aogeVar, z), aogeVar.d, application, dzsjVar, anpcVar, apjvVar);
    }
}
