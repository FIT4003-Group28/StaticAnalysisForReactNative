package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.AutoValue_ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
/* compiled from: PG */
/* renamed from: hon  reason: default package */
/* loaded from: classes3.dex */
public final class hon {
    private RecordingInfo a;
    private VideoMetaData b;
    private EditableVideoEdits c;
    private String d;
    private Boolean e;

    public hon() {
    }

    public hon(ReelItemEditModel reelItemEditModel) {
        AutoValue_ReelItemEditModel autoValue_ReelItemEditModel = (AutoValue_ReelItemEditModel) reelItemEditModel;
        this.a = autoValue_ReelItemEditModel.a;
        this.b = autoValue_ReelItemEditModel.b;
        this.c = autoValue_ReelItemEditModel.c;
        this.d = autoValue_ReelItemEditModel.d;
        this.e = Boolean.valueOf(autoValue_ReelItemEditModel.e);
    }

    public final void b(EditableVideoEdits editableVideoEdits) {
        if (editableVideoEdits != null) {
            this.c = editableVideoEdits;
            return;
        }
        throw new NullPointerException("Null editableVideoEdits");
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void d(RecordingInfo recordingInfo) {
        if (recordingInfo != null) {
            this.a = recordingInfo;
            return;
        }
        throw new NullPointerException("Null recordingInfo");
    }

    public final void e(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null stateEventFilePath");
    }

    public final void f(VideoMetaData videoMetaData) {
        if (videoMetaData != null) {
            this.b = videoMetaData;
            return;
        }
        throw new NullPointerException("Null videoMetaData");
    }

    public final ReelItemEditModel a() {
        VideoMetaData videoMetaData;
        EditableVideoEdits editableVideoEdits;
        String str;
        Boolean bool;
        RecordingInfo recordingInfo = this.a;
        if (recordingInfo == null || (videoMetaData = this.b) == null || (editableVideoEdits = this.c) == null || (str = this.d) == null || (bool = this.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" recordingInfo");
            }
            if (this.b == null) {
                sb.append(" videoMetaData");
            }
            if (this.c == null) {
                sb.append(" editableVideoEdits");
            }
            if (this.d == null) {
                sb.append(" stateEventFilePath");
            }
            if (this.e == null) {
                sb.append(" isWatchLaterStickerAdded");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new AutoValue_ReelItemEditModel(recordingInfo, videoMetaData, editableVideoEdits, str, bool.booleanValue());
    }
}
