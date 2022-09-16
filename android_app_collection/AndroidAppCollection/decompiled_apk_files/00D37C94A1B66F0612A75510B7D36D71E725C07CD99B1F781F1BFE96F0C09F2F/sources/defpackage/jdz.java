package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jdz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jdz implements ayqb {
    public final /* synthetic */ jed a;
    public final /* synthetic */ agqv b;
    private final /* synthetic */ int c;

    public /* synthetic */ jdz(jed jedVar, agqv agqvVar) {
        this.a = jedVar;
        this.b = agqvVar;
    }

    public /* synthetic */ jdz(jed jedVar, agqv agqvVar, int i) {
        this.c = i;
        this.a = jedVar;
        this.b = agqvVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.c == 0) {
            jed jedVar = this.a;
            agqv agqvVar = this.b;
            if (((Boolean) obj).booleanValue()) {
                return;
            }
            jedVar.b(agqvVar);
            if (!agqvVar.u()) {
                return;
            }
            agqu agquVar = agqvVar.j;
            atsd atsdVar = null;
            if (agquVar != null) {
                atse atseVar = agquVar.b;
                if (atseVar.c == 7) {
                    atsdVar = (atsd) atseVar.d;
                }
            }
            if (atsdVar != null) {
                jedVar.b.c(atsdVar, jedVar.c);
                return;
            } else if (agqvVar.r()) {
                zag.q(jedVar.a, R.string.cannot_watch_offline, 1);
                return;
            } else if (!agqvVar.x()) {
                if (agqvVar.l != agqe.NO_STORAGE_ERROR) {
                    zag.q(jedVar.a, R.string.add_video_to_offline_error, 1);
                    return;
                } else {
                    zag.q(jedVar.a, R.string.add_to_offline_not_enough_space, 1);
                    return;
                }
            } else if (agqvVar.j.e()) {
                return;
            } else {
                zag.q(jedVar.a, R.string.cannot_watch_offline, 1);
                return;
            }
        }
        jed jedVar2 = this.a;
        agqv agqvVar2 = this.b;
        if (((Boolean) obj).booleanValue()) {
            return;
        }
        jedVar2.b(agqvVar2);
        jedVar2.d.d(R.string.add_to_offline_done);
    }
}
