package defpackage;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpwz  reason: default package */
/* loaded from: classes5.dex */
public final class cpwz implements ServiceConnection {
    public int a = 0;
    final /* synthetic */ cpxa b;

    public cpwz(cpxa cpxaVar) {
        this.b = cpxaVar;
    }

    private final void a() {
        cpxa cpxaVar = this.b;
        cpxaVar.e = null;
        this.a = 1;
        final cpxf cpxfVar = cpxaVar.b;
        boolean z = cpxfVar.c;
        StringBuilder sb = new StringBuilder(58);
        sb.append("#resetStatesDelayed(): isMorrisVoicePlateOpened = %b ");
        sb.append(z);
        sb.toString();
        if (cpxfVar.c) {
            cpxfVar.e = dbsg.i(new Runnable(cpxfVar) { // from class: cpxc
                private final cpxf a;

                {
                    this.a = cpxfVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            });
            cpxfVar.a.postDelayed(cpxfVar.e.b(), 2000L);
        }
        cpwv cpwvVar = this.b.b.g;
        if (cpwvVar == null) {
            dcqy<String> dcqyVar = dcrd.a;
            return;
        }
        asak asakVar = (asak) cpwvVar;
        asam asamVar = asakVar.b;
        if (!asamVar.k) {
            return;
        }
        asamVar.e(asakVar.a + 1);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cpyn cpynVar;
        dcqy<String> dcqyVar = dcrd.a;
        if (componentName != null) {
            String packageName = componentName.getPackageName();
            if ("com.google.android.googlequicksearchbox".equals(packageName) && this.b.d.b(packageName)) {
                if (iBinder == null) {
                    cpynVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
                    if (queryLocalInterface instanceof cpyn) {
                        cpynVar = (cpyn) queryLocalInterface;
                    } else {
                        cpynVar = new cpyn(iBinder);
                    }
                }
                try {
                    cpxa cpxaVar = this.b;
                    cpxaVar.e = cpynVar.e(cpxaVar.a.getPackageName(), this.b.b);
                    cpxa cpxaVar2 = this.b;
                    if (cpxaVar2.e != null) {
                        this.a = 3;
                        cpwx cpwxVar = cpxaVar2.c;
                        if (cpwxVar.m.c()) {
                            cpzs e = cpwxVar.e();
                            int a = cpzw.a(cpwxVar.h);
                            if (e.c) {
                                e.bF();
                                e.c = false;
                            }
                            cpzx cpzxVar = (cpzx) e.b;
                            int i = a - 1;
                            cpzx cpzxVar2 = cpzx.h;
                            if (a != 0) {
                                cpzxVar.b = i;
                                cpzxVar.a |= 1;
                                if (TextUtils.isEmpty(null)) {
                                    if (e.c) {
                                        e.bF();
                                        e.c = false;
                                    }
                                    cpzx cpzxVar3 = (cpzx) e.b;
                                    cpzxVar3.a &= -3;
                                    cpzxVar3.c = cpzx.h.c;
                                    cpzt bZ = cpzu.b.bZ();
                                    List<String> list = cpwxVar.e;
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    cpzu cpzuVar = (cpzu) bZ.b;
                                    dsrj<String> dsrjVar = cpzuVar.a;
                                    if (!dsrjVar.a()) {
                                        cpzuVar.a = dsqw.cl(dsrjVar);
                                    }
                                    dsod.bv(list, cpzuVar.a);
                                    if (e.c) {
                                        e.bF();
                                        e.c = false;
                                    }
                                    cpzx cpzxVar4 = (cpzx) e.b;
                                    cpzu bK = bZ.bK();
                                    bK.getClass();
                                    cpzxVar4.d = bK;
                                    cpzxVar4.a |= 4;
                                    int i2 = cpwxVar.i;
                                    if (e.c) {
                                        e.bF();
                                        e.c = false;
                                    }
                                    cpzx cpzxVar5 = (cpzx) e.b;
                                    cpzxVar5.a |= 32;
                                    cpzxVar5.f = i2;
                                    if (TextUtils.isEmpty(null)) {
                                        if (e.c) {
                                            e.bF();
                                            e.c = false;
                                        }
                                        cpzx cpzxVar6 = (cpzx) e.b;
                                        cpzxVar6.a |= 16;
                                        cpzxVar6.e = "";
                                        cpzq bZ2 = cpzr.b.bZ();
                                        List<cpzp> list2 = cpwxVar.f;
                                        if (bZ2.c) {
                                            bZ2.bF();
                                            bZ2.c = false;
                                        }
                                        cpzr cpzrVar = (cpzr) bZ2.b;
                                        dsrj<cpzp> dsrjVar2 = cpzrVar.a;
                                        if (!dsrjVar2.a()) {
                                            cpzrVar.a = dsqw.cl(dsrjVar2);
                                        }
                                        dsod.bv(list2, cpzrVar.a);
                                        if (e.c) {
                                            e.bF();
                                            e.c = false;
                                        }
                                        cpzx cpzxVar7 = (cpzx) e.b;
                                        cpzr bK2 = bZ2.bK();
                                        bK2.getClass();
                                        cpzxVar7.g = bK2;
                                        cpzxVar7.a |= 64;
                                        cpzj bZ3 = cpzy.g.bZ();
                                        if (bZ3.c) {
                                            bZ3.bF();
                                            bZ3.c = false;
                                        }
                                        cpzy cpzyVar = (cpzy) bZ3.b;
                                        cpzx bK3 = e.bK();
                                        bK3.getClass();
                                        cpzyVar.c = bK3;
                                        cpzyVar.a |= 4;
                                        cpzl[] cpzlVarArr = cpwx.b;
                                        int length = cpzlVarArr.length;
                                        for (int i3 = 0; i3 < 2; i3++) {
                                            cpzl cpzlVar = cpzlVarArr[i3];
                                            if (bZ3.c) {
                                                bZ3.bF();
                                                bZ3.c = false;
                                            }
                                            cpzy cpzyVar2 = (cpzy) bZ3.b;
                                            cpzlVar.getClass();
                                            dsrf dsrfVar = cpzyVar2.f;
                                            if (!dsrfVar.a()) {
                                                cpzyVar2.f = dsqw.cg(dsrfVar);
                                            }
                                            cpzyVar2.f.h(cpzlVar.d);
                                        }
                                        try {
                                            cpwxVar.i(bZ3);
                                            cpwxVar.k = null;
                                        } catch (RemoteException unused) {
                                        }
                                    } else {
                                        if (e.c) {
                                            e.bF();
                                            e.c = false;
                                        }
                                        cpzx cpzxVar8 = (cpzx) e.b;
                                        throw null;
                                    }
                                } else {
                                    if (e.c) {
                                        e.bF();
                                        e.c = false;
                                    }
                                    cpzx cpzxVar9 = (cpzx) e.b;
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        }
                        cpwv cpwvVar = this.b.b.g;
                        if (cpwvVar == null) {
                            return;
                        }
                        ((asak) cpwvVar).b.f();
                        return;
                    }
                    a();
                    return;
                } catch (RemoteException unused2) {
                    a();
                    return;
                }
            }
        }
        a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        dcqy<String> dcqyVar = dcrd.a;
        boolean z = false;
        if (this.b.b.c) {
            ((UiModeManager) this.b.a.getSystemService("uimode")).disableCarMode(0);
            z = true;
        }
        if (z) {
            this.b.c.l(3082);
        }
        a();
        if (z) {
            this.b.c.l(3083);
        }
    }
}
