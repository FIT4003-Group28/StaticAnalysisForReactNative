package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: jki  reason: default package */
/* loaded from: classes3.dex */
public final class jki implements jkz {
    public static final /* synthetic */ int b = 0;
    public final Context a;
    private final azqb c;
    private final azqb d;
    private final jpg e;
    private final fbj f;

    public jki(Context context, azqb azqbVar, azqb azqbVar2, jpg jpgVar, fbj fbjVar) {
        this.a = context;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = jpgVar;
        this.f = fbjVar;
    }

    private final jjj d(int i) {
        return new jjj(R.attr.ytTextSecondary, this.a.getResources().getQuantityString(R.plurals.recommendation_count, i, Integer.valueOf(i)));
    }

    private final jjj e(int i) {
        return (jjj) this.f.a().E(new faz(i, 2)).E(new ayqe() { // from class: jkh
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                Integer num = (Integer) obj;
                return new jjj(R.attr.ytTextSecondary, jki.this.a.getResources().getQuantityString(R.plurals.video_count, num.intValue(), num));
            }
        }).U();
    }

    @Override // defpackage.jkz
    public final jjj a() {
        Collection<agqv> j = ((agrf) this.c.get()).a().m().j();
        ArrayList arrayList = new ArrayList();
        for (agqv agqvVar : j) {
            if (!agqvVar.s()) {
                arrayList.add(agqvVar);
            }
        }
        fcl fclVar = (fcl) this.d.get();
        if (arrayList.isEmpty()) {
            int i = ((amxx) fclVar.d).c;
            if (i > 0) {
                return d(i);
            }
            if (!j.isEmpty()) {
                return d(j.size());
            }
            return e(0);
        }
        return e(arrayList.size());
    }

    @Override // defpackage.jkz
    public final jjj b(agqg agqgVar) {
        String string;
        if (agqgVar == null) {
            return new jjj(R.attr.ytTextSecondary, "");
        }
        if (agqgVar.e()) {
            aqxo.p(agqgVar.e());
            return new jjj(R.attr.ytTextSecondary, nni.o(this.a, agqgVar.a));
        }
        aqxo.p(!agqgVar.e());
        int i = agqgVar.e;
        if (i == 0) {
            string = this.a.getString(R.string.offline_playlist_waiting);
        } else {
            string = this.a.getString(R.string.offline_adding_progress, Integer.valueOf(i));
        }
        return new jjj(R.attr.ytStaticBlue, string);
    }

    @Override // defpackage.jkz
    public final jjj c(int i, agqv agqvVar) {
        jjj jjjVar;
        String l;
        jpg jpgVar = this.e;
        jpf jpfVar = (jpf) jpgVar.b.get(Integer.valueOf(i));
        jpfVar.getClass();
        String str = "";
        if (agqvVar == null || agqvVar.i() == agqp.DELETED) {
            String[] strArr = new String[1];
            if (i == 1) {
                str = jpgVar.a.getString(R.string.downloaded_video_deleted);
            }
            strArr[0] = str;
            jjjVar = new jjj(R.attr.ytTextDisabled, strArr);
        } else {
            agqp i2 = agqvVar.i();
            if (i2 == agqp.PLAYABLE || i2 == agqp.CANDIDATE) {
                agqu agquVar = agqvVar.j;
                if (agquVar == null || !jpgVar.c.c() || !nni.s(agquVar) || i != 1) {
                    return new jjj(R.attr.ytTextDisabled, str);
                }
                jjjVar = new jjj(R.attr.ytTextDisabled, nni.p(jpgVar.a, nni.i(agquVar, jpgVar.d), true));
            } else if (i2 != agqp.TRANSFER_IN_PROGRESS) {
                ampq a = jpfVar.a(i2, agqvVar.j, agqvVar.k);
                if (a.h()) {
                    l = jpgVar.a.getString(((Integer) a.c()).intValue());
                } else {
                    l = agqvVar.l(i2, jpgVar.a);
                }
                return jpg.a(agqvVar, i) ? new jjj(R.attr.ytStaticBlue, l, jpgVar.a.getString(R.string.downloaded_video_partially_playable)) : new jjj(R.attr.ytTextDisabled, l);
            } else {
                String string = jpgVar.a.getString(R.string.downloaded_video_in_progress, Integer.valueOf(agqvVar.c()));
                return jpg.a(agqvVar, i) ? new jjj(R.attr.ytStaticBlue, string, jpgVar.a.getString(R.string.downloaded_video_partially_playable)) : new jjj(R.attr.ytStaticBlue, string);
            }
        }
        return jjjVar;
    }
}
