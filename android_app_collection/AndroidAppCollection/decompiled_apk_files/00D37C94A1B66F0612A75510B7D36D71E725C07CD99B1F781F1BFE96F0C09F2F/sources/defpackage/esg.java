package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: esg  reason: default package */
/* loaded from: classes3.dex */
public final class esg implements aafl {
    private final rbi a;
    private final qst b;

    public esg(Context context) {
        this.b = rbh.e(context);
        this.a = new rbi(context);
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String str = (String) zew.K(map, "SilentSubmitUserFeedbackCommandResolver.DESCRIPTION_KEY", String.class);
        if (str == null || str.length() == 0) {
            return;
        }
        SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand = (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand) apzgVar.qm(SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.silentSubmitUserFeedbackCommand);
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : Collections.unmodifiableMap(silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.c).entrySet()) {
            hashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        rbi rbiVar = this.a;
        rbiVar.b = str;
        rbiVar.c = silentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.b;
        rbiVar.c();
        rbiVar.b(true);
        for (Map.Entry entry2 : hashMap.entrySet()) {
            rbiVar.a.putString((String) entry2.getKey(), (String) entry2.getValue());
        }
        this.b.x(rbiVar.a());
    }
}
