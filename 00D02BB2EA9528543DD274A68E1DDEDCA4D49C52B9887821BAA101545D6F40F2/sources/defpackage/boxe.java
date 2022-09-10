package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: boxe  reason: default package */
/* loaded from: classes3.dex */
public class boxe implements Serializable {
    public boolean a;
    public boolean b;
    public eaol c;
    public eaol d;

    public boxe() {
        this.a = false;
        this.b = true;
        this.c = eaol.a();
        this.d = new eaol(this.c.y(), this.c.z(), this.c.A(), 23, 59);
    }

    public boxe(boolean z, eaol eaolVar, eaol eaolVar2) {
        this.a = false;
        this.b = z;
        this.c = eaolVar;
        this.d = eaolVar2;
    }
}
