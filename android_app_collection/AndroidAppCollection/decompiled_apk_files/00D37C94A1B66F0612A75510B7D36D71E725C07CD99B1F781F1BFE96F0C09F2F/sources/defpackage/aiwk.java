package defpackage;

import com.google.android.libraries.youtube.player.subtitles.model.SubtitleWindowSettings;
import java.util.Deque;
import org.xml.sax.Attributes;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aiwk  reason: default package */
/* loaded from: classes.dex */
public final class aiwk extends zna {
    @Override // defpackage.zna
    public final void n(Deque deque, Attributes attributes, String str) {
        aixx aixxVar = (aixx) deque.peekFirst();
        if (aixxVar == null) {
            return;
        }
        int b = aiwv.b(attributes, 0, "w", "win", "id");
        String f = aiwv.f(attributes, "t", "start");
        if (f == null) {
            return;
        }
        int parseInt = Integer.parseInt(f);
        String value = attributes.getValue("op");
        if (value == null || !value.equals("define")) {
            return;
        }
        String f2 = aiwv.f(attributes, "ap");
        int a = f2 != null ? aiwv.a(Integer.parseInt(f2)) : 34;
        String f3 = aiwv.f(attributes, "ah");
        int max = f3 != null ? Math.max(0, Math.min(Integer.parseInt(f3), 100)) : 50;
        String f4 = aiwv.f(attributes, "av");
        int max2 = f4 != null ? Math.max(0, Math.min(Integer.parseInt(f4), 100)) : 95;
        String f5 = aiwv.f(attributes, "vs");
        aixxVar.b(b).e(parseInt, new SubtitleWindowSettings(a, max, max2, f5 != null ? Boolean.parseBoolean(f5) : true, aiwv.f(attributes, "sd") != null));
    }
}
