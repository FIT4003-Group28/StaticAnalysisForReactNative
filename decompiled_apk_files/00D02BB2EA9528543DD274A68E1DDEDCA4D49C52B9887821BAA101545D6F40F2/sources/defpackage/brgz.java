package defpackage;

import android.net.Uri;
import java.util.regex.Matcher;
/* renamed from: brgz  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class brgz implements dbsl {
    static final dbsl a = new brgz();

    private brgz() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        dcep<String> dcepVar = brha.a;
        Uri data = ((afga) obj).a.getData();
        if (data != null && brha.a.contains(data.getHost())) {
            String path = data.getPath();
            String str = null;
            if (!dbsj.d(path)) {
                Matcher matcher = brha.b.matcher(path);
                if (matcher.find()) {
                    str = matcher.group(1);
                }
            }
            if (str == null) {
                return false;
            }
            return bij.c(str);
        }
        return false;
    }
}
