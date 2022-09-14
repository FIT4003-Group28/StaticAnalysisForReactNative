package defpackage;

import android.provider.MediaStore;
/* renamed from: cacq  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cacq implements dbsl {
    static final dbsl a = new cacq();

    private cacq() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        String uri = ((bztl) obj).a().toString();
        String valueOf = String.valueOf(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append(valueOf);
        sb.append("/");
        return !uri.startsWith(sb.toString());
    }
}
