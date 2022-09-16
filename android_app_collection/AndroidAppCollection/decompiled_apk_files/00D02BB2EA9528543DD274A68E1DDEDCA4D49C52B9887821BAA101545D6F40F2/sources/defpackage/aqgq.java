package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aqgq  reason: default package */
/* loaded from: classes2.dex */
public final class aqgq {
    public final btvo a;
    private final aqal b;
    private final bvrb c;

    public aqgq(btvo btvoVar, bvrb bvrbVar, aqal aqalVar) {
        this.a = btvoVar;
        this.b = aqalVar;
        this.c = bvrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ bvny a() {
        return new bvny(500L);
    }

    public final void b(final deig<String> deigVar, final bvny bvnyVar, final int i) {
        try {
            aqal aqalVar = this.b;
            deigVar.j(aqalVar.a.a() == null ? "" : dbsj.e(FirebaseInstanceId.getInstance(aqalVar.a.a()).g("466216207879", "FCM")));
        } catch (Exception e) {
            if (!(e instanceof IOException) || i <= 0) {
                deigVar.k(e);
            } else {
                this.c.a(new Runnable(this, deigVar, bvnyVar, i) { // from class: aqgp
                    private final aqgq a;
                    private final deig b;
                    private final bvny c;
                    private final int d;

                    {
                        this.a = this;
                        this.b = deigVar;
                        this.c = bvnyVar;
                        this.d = i;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b, this.c, this.d - 1);
                    }
                }, bvrj.BACKGROUND_THREADPOOL, bvnyVar.a());
            }
        }
    }
}
