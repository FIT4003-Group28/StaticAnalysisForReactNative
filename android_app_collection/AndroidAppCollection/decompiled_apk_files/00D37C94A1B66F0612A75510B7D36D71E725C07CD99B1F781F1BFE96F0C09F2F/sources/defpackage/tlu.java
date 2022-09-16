package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.apps.youtube.embeddedplayer.service.hostappverification.g;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: tlu  reason: default package */
/* loaded from: classes4.dex */
public final class tlu {
    qqh a;
    qqh b;
    private final Context c;
    private final Executor d;

    public tlu() {
    }

    public tlu(Context context, Executor executor) {
        this.c = context;
        this.d = executor;
    }

    public final ankt b(final tlt tltVar, ankt anktVar) {
        final String str = tltVar.a;
        final aoqu aoquVar = tltVar.b;
        final ampg ampgVar = new ampg() { // from class: tlv
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                tlt tltVar2 = tlt.this;
                qqe qqeVar = (qqe) obj;
                anew anewVar = tltVar2.c;
                if (anewVar != null) {
                    aoob byteString = anewVar.toByteString();
                    axiq axiqVar = qqeVar.b;
                    axiqVar.copyOnWrite();
                    ((axir) axiqVar.instance).r(byteString);
                }
                if (tltVar2.g != 1) {
                    qqeVar.k = 0;
                }
                int[] iArr = tltVar2.e;
                if (iArr != null && (r2 = iArr.length) > 0) {
                    if (qqeVar.a.d()) {
                        Log.e("ClearcutLogger", "addExperimentIds forbidden on deidentified logger");
                    }
                    if (qqeVar.f == null) {
                        qqeVar.f = new ArrayList();
                    }
                    for (int i : iArr) {
                        qqeVar.f.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = tltVar2.f;
                if (iArr2 != null && (r1 = iArr2.length) > 0) {
                    for (int i2 : iArr2) {
                        if (qqeVar.d == null) {
                            qqeVar.d = new ArrayList();
                        }
                        qqeVar.d.add(Integer.valueOf(i2));
                    }
                }
                return qqeVar;
            }
        };
        return anhq.i(anii.i(anktVar, new anir() { // from class: tlw
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                tlu tluVar = tlu.this;
                aoqu aoquVar2 = aoquVar;
                ampg ampgVar2 = ampgVar;
                String str2 = str;
                tlf tlfVar = (tlf) obj;
                qqh a = tluVar.a(tlfVar);
                if (a == null) {
                    return anlz.q(null);
                }
                qqe a2 = a.a(aoquVar2.toByteArray());
                ampgVar2.apply(a2);
                a2.i = str2;
                a2.l = null;
                int i = tlfVar.b - 1;
                if (i == 0) {
                    a2.e(tlfVar.a);
                } else if (i == 1) {
                    a2.e(null);
                } else if (i != 2) {
                    throw new IllegalArgumentException("Dropped logs must not be logged.");
                }
                qta b = a2.b();
                final SettableFuture f = SettableFuture.f();
                b.g(new qtf() { // from class: tim
                    @Override // defpackage.qtf
                    public final void a(qte qteVar) {
                        SettableFuture settableFuture = SettableFuture.this;
                        if (qteVar.a().g != 16) {
                            if (qteVar.a().c()) {
                                settableFuture.o(qteVar);
                                return;
                            } else if (qteVar.a().i != null) {
                                settableFuture.e(new qtc(qteVar.a()));
                                return;
                            } else {
                                settableFuture.e(new qsp(qteVar.a()));
                                return;
                            }
                        }
                        settableFuture.cancel(false);
                    }
                });
                return anii.h(f, akzj.e(), anjk.a);
            }
        }, this.d), qsp.class, g.f, anjk.a);
    }

    public final synchronized qqh a(tlf tlfVar) {
        int i = tlfVar.b - 1;
        if (i == 0 || i == 1) {
            if (this.a == null) {
                this.a = new qqh(this.c, null, null);
            }
            return this.a;
        } else if (i != 2) {
            return null;
        } else {
            if (this.b == null) {
                this.b = qqh.b(this.c, null);
            }
            return this.b;
        }
    }
}
