package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aijn  reason: default package */
/* loaded from: classes.dex */
public final class aijn {
    private static final Map a = new ConcurrentHashMap();

    static {
        b(new aikb());
        b(new aikc());
        b(new aijk());
        b(new aijv());
    }

    public static aijm a(apzg apzgVar) {
        if (apzgVar != null) {
            for (aijm aijmVar : a.values()) {
                if (apzgVar.qn(aijmVar.b())) {
                    return aijmVar;
                }
            }
            return null;
        }
        return null;
    }

    public static void b(aijm aijmVar) {
        a.put(aijmVar.b(), aijmVar);
    }

    public static boolean d(apzg apzgVar, apzg apzgVar2) {
        aijm a2 = a(apzgVar);
        if (a2 == null || !apzgVar2.qn(a2.b())) {
            return false;
        }
        return a2.l(apzgVar, apzgVar2);
    }

    public static boolean c(PlaybackStartDescriptor playbackStartDescriptor, PlaybackStartDescriptor playbackStartDescriptor2) {
        if (playbackStartDescriptor == playbackStartDescriptor2) {
            return true;
        }
        if (playbackStartDescriptor != null && playbackStartDescriptor2 != null) {
            apzg apzgVar = playbackStartDescriptor.b;
            apzg apzgVar2 = playbackStartDescriptor2.b;
            if (apzgVar == null || apzgVar2 == null) {
                if (playbackStartDescriptor.m() == null && playbackStartDescriptor2.m() == null && playbackStartDescriptor.t() == playbackStartDescriptor2.t() && playbackStartDescriptor.v() == playbackStartDescriptor2.v() && TextUtils.equals(playbackStartDescriptor.k(), playbackStartDescriptor2.k()) && (TextUtils.equals("", playbackStartDescriptor.k()) || Math.abs(playbackStartDescriptor.a() - playbackStartDescriptor2.a()) <= 1)) {
                    return TextUtils.equals(playbackStartDescriptor.l(), playbackStartDescriptor2.l());
                }
            } else {
                return d(apzgVar, apzgVar2);
            }
        }
        return false;
    }
}
