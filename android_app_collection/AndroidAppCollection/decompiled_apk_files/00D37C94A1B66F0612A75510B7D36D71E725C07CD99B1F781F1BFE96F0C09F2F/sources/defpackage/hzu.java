package defpackage;

import j$.util.Optional;
import java.util.List;
/* compiled from: PG */
/* renamed from: hzu  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hzu implements zdt {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ hzu(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.add(Optional.ofNullable(((iaj) obj).h));
        } else {
            this.a.add(((iaj) obj).d);
        }
    }
}
