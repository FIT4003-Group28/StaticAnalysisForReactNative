package defpackage;

import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import com.google.android.libraries.youtube.player.subtitles.model.SubtitleTrack;
/* compiled from: PG */
/* renamed from: aibd  reason: default package */
/* loaded from: classes.dex */
final class aibd implements DialogInterface.OnClickListener {
    final /* synthetic */ ArrayAdapter a;
    final /* synthetic */ aibf b;

    public aibd(ArrayAdapter arrayAdapter, aibf aibfVar) {
        this.a = arrayAdapter;
        this.b = aibfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.pA((SubtitleTrack) this.a.getItem(i));
        dialogInterface.dismiss();
    }
}
