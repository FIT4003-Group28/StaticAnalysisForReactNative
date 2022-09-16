package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: agul  reason: default package */
/* loaded from: classes.dex */
public class agul extends agsp implements ynl {
    private final Context e;

    public agul(Context context, agvx agvxVar, String str) {
        super(agvxVar, str);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agsp
    public Pair a() {
        if (!g()) {
            return super.a();
        }
        List emptyList = Collections.emptyList();
        List k = this.a.m().k();
        agqf agqfVar = null;
        if (!k.isEmpty()) {
            if (k.size() > 1) {
                agqfVar = agqf.b(k.size(), this.e.getString(R.string.single_videos_playlist_title), null, null);
            }
            emptyList = k;
        }
        return b(agqfVar, emptyList);
    }

    @Override // defpackage.agsp
    public final boolean e() {
        return !TextUtils.isEmpty(this.b) && !g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean g() {
        return TextUtils.equals("PPSV", this.b);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                agnt agntVar = (agnt) obj;
                if (!g()) {
                    return null;
                }
                a();
                return null;
            } else if (i == 1) {
                agoa agoaVar = (agoa) obj;
                if (!g()) {
                    return null;
                }
                a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{agnt.class, agoa.class};
    }
}
