package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: twu  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class twu implements anir {
    public final /* synthetic */ twv a;
    public final /* synthetic */ tqy b;
    private final /* synthetic */ int c;

    public /* synthetic */ twu(twv twvVar, tqy tqyVar) {
        this.a = twvVar;
        this.b = tqyVar;
    }

    public /* synthetic */ twu(twv twvVar, tqy tqyVar, int i) {
        this.c = i;
        this.a = twvVar;
        this.b = tqyVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        int i = this.c;
        int i2 = 1;
        if (i == 0) {
            twv twvVar = this.a;
            tqy tqyVar = this.b;
            tqz tqzVar = (tqz) obj;
            if (tqzVar == null) {
                typ.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                return anlz.p(new tww());
            }
            tqu a = tqu.a(tqzVar.d);
            if (a == null) {
                a = tqu.NONE;
            }
            if (a != tqu.DOWNLOAD_COMPLETE) {
                Context context = twvVar.a;
                int b = tqn.b(tqyVar.f);
                Uri q = tzc.q(context, b == 0 ? 1 : b, tqzVar.c, tqyVar.e, twvVar.b, twvVar.j, false);
                if (q != null) {
                    twvVar.d.b(q);
                }
            }
            return ankq.a;
        } else if (i != 1) {
            if (i == 2) {
                twv twvVar2 = this.a;
                tqy tqyVar2 = this.b;
                tqz tqzVar2 = (tqz) obj;
                if (tqzVar2 == null) {
                    typ.d("%s: getOnDeviceUri called on file that doesn't exists. Key = %s!", "SharedFileManager", tqyVar2);
                    return anlz.p(new tww());
                }
                Context context2 = twvVar2.a;
                int b2 = tqn.b(tqyVar2.f);
                if (b2 != 0) {
                    i2 = b2;
                }
                return anlz.q(tzc.q(context2, i2, tqzVar2.c, tqzVar2.g, twvVar2.b, twvVar2.j, tqzVar2.e));
            }
            twv twvVar3 = this.a;
            tqy tqyVar3 = this.b;
            tqz tqzVar3 = (tqz) obj;
            if (tqzVar3 == null) {
                typ.d("%s: No file entry with key %s", "SharedFileManager", tqyVar3);
                return anlz.q(false);
            }
            Context context3 = twvVar3.a;
            int b3 = tqn.b(tqyVar3.f);
            Uri q2 = tzc.q(context3, b3 == 0 ? 1 : b3, tqzVar3.c, tqyVar3.e, twvVar3.b, twvVar3.j, false);
            if (q2 != null) {
                twvVar3.d.b(q2);
            }
            return anii.i(twvVar3.c.f(tqyVar3), new twr(tqyVar3), twvVar3.k);
        } else {
            twv twvVar4 = this.a;
            tqy tqyVar4 = this.b;
            if (((tqz) obj) != null) {
                return anlz.q(true);
            }
            SharedPreferences b4 = uaw.b(twvVar4.a, "gms_icing_mdd_shared_file_manager_metadata", twvVar4.j);
            long j = b4.getLong("next_file_name_v2", System.currentTimeMillis());
            if (!b4.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                typ.d("%s: Unable to update file name %s", "SharedFileManager", tqyVar4);
                return anlz.q(false);
            }
            StringBuilder sb = new StringBuilder(37);
            sb.append("datadownloadfile_");
            sb.append(j);
            String sb2 = sb.toString();
            aopa createBuilder = tqz.a.createBuilder();
            tqu tquVar = tqu.SUBSCRIBED;
            createBuilder.copyOnWrite();
            tqz tqzVar4 = (tqz) createBuilder.instance;
            tqzVar4.d = tquVar.h;
            tqzVar4.b |= 2;
            createBuilder.copyOnWrite();
            tqz tqzVar5 = (tqz) createBuilder.instance;
            sb2.getClass();
            tqzVar5.b = 1 | tqzVar5.b;
            tqzVar5.c = sb2;
            return anii.i(twvVar4.c.g(tqyVar4, (tqz) createBuilder.mo39build()), new twr(tqyVar4, 2), twvVar4.k);
        }
    }
}
