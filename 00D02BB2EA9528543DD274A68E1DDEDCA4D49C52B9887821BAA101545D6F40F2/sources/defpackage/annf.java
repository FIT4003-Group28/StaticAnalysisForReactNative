package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
/* compiled from: PG */
/* renamed from: annf  reason: default package */
/* loaded from: classes.dex */
public final class annf extends afhx {
    public static final dbsl<afga> b;
    private static final drqz c;
    public final anhg a;
    private final akfc d;

    static {
        drpt bZ = drqz.e.bZ();
        drpx bZ2 = drqy.c.bZ();
        drqi bZ3 = drqt.c.bZ();
        drqq drqqVar = drqq.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        drqt drqtVar = (drqt) bZ3.b;
        drqqVar.getClass();
        drqtVar.b = drqqVar;
        drqtVar.a = 1;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drqy drqyVar = (drqy) bZ2.b;
        drqt bK = bZ3.bK();
        bK.getClass();
        drqyVar.b = bK;
        drqyVar.a = 5;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        drqz drqzVar = (drqz) bZ.b;
        drqy bK2 = bZ2.bK();
        bK2.getClass();
        drqzVar.b = bK2;
        drqzVar.a |= 1;
        c = bZ.bK();
        b = annd.a;
    }

    public annf(Intent intent, @dzsi String str, akfc akfcVar, anhg anhgVar) {
        super(intent, str, afid.TIMELINE_GOOGLE_INTERNAL);
        this.d = akfcVar;
        this.a = anhgVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        String stringExtra = this.f.getStringExtra("obfuscated_gaia_id");
        String stringExtra2 = this.f.getStringExtra("account_name");
        drqz drqzVar = c;
        if (this.f.hasExtra("timeline_link")) {
            try {
                Intent intent = this.f;
                drqz drqzVar2 = drqz.e;
                dsqa b2 = dsqa.b();
                Parcelable parcelableExtra = intent.getParcelableExtra("timeline_link");
                if (parcelableExtra instanceof Bundle) {
                    Bundle bundle = (Bundle) parcelableExtra;
                    bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle.getParcelable("protoparsers");
                } else {
                    protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
                }
                drqzVar = (drqz) dsuv.b(protoParsers$InternalDontUse, drqzVar2, b2);
            } catch (dsrm unused) {
            }
        }
        if (!dbsj.d(stringExtra)) {
            this.d.o(stringExtra, new anne(this, drqzVar));
        } else if (!dbsj.d(stringExtra2)) {
            this.d.n(stringExtra2, new anne(this, drqzVar));
        } else {
            this.a.G(drqzVar, dbpy.a);
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
