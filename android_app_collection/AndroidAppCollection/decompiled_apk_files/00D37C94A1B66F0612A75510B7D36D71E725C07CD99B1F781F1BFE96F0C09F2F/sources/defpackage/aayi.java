package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: aayi  reason: default package */
/* loaded from: classes.dex */
public final class aayi extends aaqs {
    public String a;
    public avxr b;

    public aayi(aaqf aaqfVar, afvm afvmVar) {
        super("live/get_confirm_broadcast_setup", aaqfVar, afvmVar);
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arte.a.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            createBuilder.copyOnWrite();
            arte arteVar = (arte) createBuilder.instance;
            str.getClass();
            arteVar.b |= 4;
            arteVar.e = str;
        }
        avxr avxrVar = this.b;
        if (avxrVar != null) {
            createBuilder.copyOnWrite();
            arte arteVar2 = (arte) createBuilder.instance;
            arteVar2.d = avxrVar;
            arteVar2.b |= 2;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
    }
}
