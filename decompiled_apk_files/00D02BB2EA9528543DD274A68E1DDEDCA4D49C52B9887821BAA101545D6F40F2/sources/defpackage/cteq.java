package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cteq  reason: default package */
/* loaded from: classes5.dex */
public final class cteq extends ctfo {
    public List<ctrg> a;
    public List<String> b;
    public Boolean c;

    @Override // defpackage.ctfo
    public final void a(List<String> list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null ackIds");
    }

    @Override // defpackage.ctfo
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
