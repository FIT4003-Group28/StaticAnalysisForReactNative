package defpackage;

import android.net.Uri;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: afti  reason: default package */
/* loaded from: classes.dex */
public final class afti extends yua {
    final /* synthetic */ yiw a;
    final /* synthetic */ Uri b;
    final /* synthetic */ aftj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afti(aftj aftjVar, String str, cez cezVar, yiw yiwVar, Uri uri) {
        super(1, str, cezVar);
        this.c = aftjVar;
        this.a = yiwVar;
        this.b = uri;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        try {
            return cfb.b(this.c.a.b(cewVar), acx.g(cewVar));
        } catch (IOException | zhy e) {
            return cfb.a(new cff(e));
        }
    }

    @Override // defpackage.yua
    public final void qz(Object obj) {
        this.a.b(this.b, obj);
    }
}
