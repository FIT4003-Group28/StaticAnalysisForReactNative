package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crow  reason: default package */
/* loaded from: classes5.dex */
public class crow {
    public final cqat a;
    public final ddnp b = ddnq.j.bZ();
    public final List<ddns> c = new ArrayList();
    public long d = 0;
    @dzsi
    public ddnr e;

    public crow(cqat cqatVar) {
        this.a = cqatVar;
    }

    public final void a(int i) {
        ddnp ddnpVar = this.b;
        if (ddnpVar.c) {
            ddnpVar.bF();
            ddnpVar.c = false;
        }
        ddnq ddnqVar = (ddnq) ddnpVar.b;
        ddnq ddnqVar2 = ddnq.j;
        ddnqVar.b = i - 1;
        ddnqVar.a |= 1;
    }
}
