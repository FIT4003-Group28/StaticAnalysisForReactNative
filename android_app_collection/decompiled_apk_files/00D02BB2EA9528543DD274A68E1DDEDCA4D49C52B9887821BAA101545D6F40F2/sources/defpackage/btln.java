package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: btln  reason: default package */
/* loaded from: classes4.dex */
public class btln implements btlm {
    private final bxko a;
    private final List<btlp> b = new ArrayList();

    public btln(bxko bxkoVar) {
        this.a = bxkoVar;
    }

    @Override // defpackage.btlm
    public List<? extends btlp> a() {
        return this.b;
    }

    @Override // defpackage.bxqe
    public void b(String str) {
    }

    @Override // defpackage.bxqe
    public void c(String str, int i) {
        throw null;
    }
}
