package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* compiled from: PG */
/* renamed from: pot  reason: default package */
/* loaded from: classes4.dex */
public final class pot implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public pot() {
    }

    public pot(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new BinaryFrame(parcel);
            case 1:
                return new ApicFrame(parcel);
            case 2:
                return new ChapterFrame(parcel);
            case 3:
                return new ChapterTocFrame(parcel);
            case 4:
                return new CommentFrame(parcel);
            case 5:
                return new GeobFrame(parcel);
            case 6:
                return new InternalFrame(parcel);
            case 7:
                return new MlltFrame(parcel);
            case 8:
                return new PrivFrame(parcel);
            case 9:
                return new TextInformationFrame(parcel);
            case 10:
                return new UrlLinkFrame(parcel);
            case 11:
                return new MdtaMetadataEntry(parcel);
            case 12:
                return new MotionPhotoMetadata(parcel);
            case 13:
                return new SmtaMetadataEntry(parcel);
            case 14:
                return new PrivateCommand(parcel);
            case 15:
                return new SpliceInsertCommand(parcel);
            case 16:
                return new SpliceNullCommand();
            case 17:
                return new SpliceScheduleCommand(parcel);
            case 18:
                return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
            case 19:
                return new TrackGroup(parcel);
            default:
                return new TrackGroupArray(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BinaryFrame[i];
            case 1:
                return new ApicFrame[i];
            case 2:
                return new ChapterFrame[i];
            case 3:
                return new ChapterTocFrame[i];
            case 4:
                return new CommentFrame[i];
            case 5:
                return new GeobFrame[i];
            case 6:
                return new InternalFrame[i];
            case 7:
                return new MlltFrame[i];
            case 8:
                return new PrivFrame[i];
            case 9:
                return new TextInformationFrame[i];
            case 10:
                return new UrlLinkFrame[i];
            case 11:
                return new MdtaMetadataEntry[i];
            case 12:
                return new MotionPhotoMetadata[i];
            case 13:
                return new SmtaMetadataEntry[i];
            case 14:
                return new PrivateCommand[i];
            case 15:
                return new SpliceInsertCommand[i];
            case 16:
                return new SpliceNullCommand[i];
            case 17:
                return new SpliceScheduleCommand[i];
            case 18:
                return new TimeSignalCommand[i];
            case 19:
                return new TrackGroup[i];
            default:
                return new TrackGroupArray[i];
        }
    }
}
