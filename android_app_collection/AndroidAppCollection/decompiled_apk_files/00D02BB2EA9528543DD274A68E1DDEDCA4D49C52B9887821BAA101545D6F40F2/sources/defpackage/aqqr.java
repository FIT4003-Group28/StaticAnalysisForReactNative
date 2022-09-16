package defpackage;

import android.net.Uri;
/* renamed from: aqqr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aqqr implements dbsl {
    static final dbsl a = new aqqr();

    private aqqr() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Uri data = ((afga) obj).a.getData();
        if (data == null || !"business.google.com".equals(data.getHost()) || data.getPath() == null) {
            return false;
        }
        String path = data.getPath();
        dbsk.s(path);
        if (!path.startsWith("/messages/l")) {
            String path2 = data.getPath();
            dbsk.s(path2);
            if (!path2.startsWith("/conversations/l")) {
                return false;
            }
        }
        return data.getPathSegments().size() >= 3;
    }
}
