package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: zfd  reason: default package */
/* loaded from: classes4.dex */
final class zfd implements zff {
    private final /* synthetic */ int a;

    public zfd() {
    }

    public zfd(int i) {
        this.a = i;
    }

    @Override // defpackage.zff
    public final Object a(Map.Entry entry) {
        return this.a != 0 ? entry.getKey() : ((zfg) entry).c;
    }
}
