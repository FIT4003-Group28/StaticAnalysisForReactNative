package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntry;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelWatchBackstack$BackstackEntryStack;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.AutoValue_ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.media.ShortsVideoMetadata;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelSequenceNavigator$ReelSequenceNavigatorState;
import com.google.android.apps.youtube.app.extensions.upload.UploadFrontendIdMapHelper;
import com.google.android.apps.youtube.app.fragments.PlaylistEditorFragment$EditorState;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanePanelsController_PanePanelsState;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanelsBackStack;
import com.google.android.apps.youtube.app.fragments.panels.PanePanelsController$PanePanelsState;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.ui.swipetocontainer.SwipeToContainerFrameLayout;
import com.google.android.apps.youtube.app.watch.navigation.WatchHistoryListIterator;
import com.google.android.apps.youtube.embeddedplayer.service.csi.shared.model.SetOperationType;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.apps.tiktok.account.AccountId;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: gta  reason: default package */
/* loaded from: classes3.dex */
public final class gta implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public gta() {
    }

    public gta(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ReelToReelList[i];
            case 1:
                return new PanelsConfiguration[i];
            case 2:
                return new ReelWatchBackstack$BackstackEntry[i];
            case 3:
                return new ReelWatchBackstack$BackstackEntryStack[i];
            case 4:
                return new AutoValue_ShortsVideoMetadata[i];
            case 5:
                return new ShortsCreationSelectedTrack[i];
            case 6:
                return new ReelEditModel[i];
            case 7:
                return new ReelEditModel.DeletedItem[i];
            case 8:
                return new ReelItemEditModel[i];
            case 9:
                return new ReelSequenceController$PendingContinuation[i];
            case 10:
                return new ReelSequenceNavigator$ReelSequenceNavigatorState[i];
            case 11:
                return new UploadFrontendIdMapHelper[i];
            case 12:
                return new PlaylistEditorFragment$EditorState[i];
            case 13:
                return new AutoValue_PanePanelsController_PanePanelsState[i];
            case 14:
                return new AutoValue_PanelFragmentDescriptor[i];
            case 15:
                return new AutoValue_PanelsBackStack[i];
            case 16:
                return new PanelsBackStack.PanelsBackStackEntry[i];
            case 17:
                return new MdxWatchDrawerLayout.SavedState[i];
            case 18:
                return new SwipeToContainerFrameLayout.SavedState[i];
            case 19:
                return new WatchHistoryListIterator[i];
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        avhn avhnVar;
        boolean z = false;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ParcelableMessageLite.class.getClassLoader());
                int length = readParcelableArray.length;
                ArrayList arrayList = new ArrayList(length);
                ArrayList arrayList2 = new ArrayList(length);
                for (Parcelable parcelable : readParcelableArray) {
                    arrayList.add((apzg) ((ParcelableMessageLite) parcelable).a(apzg.a));
                    byte[] createByteArray = parcel.createByteArray();
                    if (createByteArray.length == 0) {
                        arrayList2.add(Optional.empty());
                    } else {
                        arrayList2.add(Optional.of(aoob.x(createByteArray)));
                    }
                }
                return new ReelToReelList(Collections.unmodifiableList(arrayList), Collections.unmodifiableList(arrayList2));
            case 1:
                ClassLoader classLoader = getClass().getClassLoader();
                return new PanelsConfiguration((PanelDescriptor) parcel.readParcelable(classLoader), Optional.ofNullable((PanelDescriptor) parcel.readParcelable(classLoader)));
            case 2:
                return new ReelWatchBackstack$BackstackEntry(parcel);
            case 3:
                return new ReelWatchBackstack$BackstackEntryStack(parcel);
            case 4:
                return new AutoValue_ShortsVideoMetadata((Uri) parcel.readParcelable(ShortsVideoMetadata.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readLong());
            case 5:
                hfo m = ShortsCreationSelectedTrack.m();
                m.d(parcel.readString());
                m.c(parcel.readLong());
                if (parcel.readInt() == 1) {
                    z2 = true;
                }
                m.b(z2);
                m.a = parcel.readString();
                try {
                    avhnVar = (avhn) aopi.parseFrom(avhn.a, parcel.createByteArray(), aoos.b());
                } catch (aopx e) {
                    zep.d("Error parsing ShortsCreationSelectedTrack", e);
                    avhnVar = null;
                }
                m.c = avhnVar;
                m.e = parcel.readString();
                m.f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
                long readLong = parcel.readLong();
                if (readLong != -1) {
                    m.g = ampq.j(Long.valueOf(readLong));
                }
                int readInt = parcel.readInt();
                if (readInt != -1) {
                    byte[] bArr = new byte[readInt];
                    parcel.readByteArray(bArr);
                    m.h = ampq.j(bArr);
                }
                if (parcel.readInt() == 1) {
                    try {
                        m.b = (apzg) aopi.parseFrom(apzg.a, parcel.createByteArray(), aoos.b());
                    } catch (aopx e2) {
                        zep.d("Error parsing ShortsCreationSelectedTrack", e2);
                    }
                }
                return m.a();
            case 6:
                hnx e3 = ReelEditModel.e();
                e3.c(parcel.createTypedArrayList(ReelItemEditModel.CREATOR));
                e3.b(parcel.readInt());
                e3.a = (ReelEditModel.DeletedItem) parcel.readParcelable(ReelEditModel.DeletedItem.class.getClassLoader());
                return e3.a();
            case 7:
                return ReelEditModel.DeletedItem.c(parcel.readInt(), (ReelItemEditModel) parcel.readParcelable(ReelItemEditModel.class.getClassLoader()));
            case 8:
                hon g = ReelItemEditModel.g();
                g.d((RecordingInfo) parcel.readParcelable(RecordingInfo.class.getClassLoader()));
                g.f((VideoMetaData) parcel.readParcelable(VideoMetaData.class.getClassLoader()));
                g.b((EditableVideoEdits) parcel.readParcelable(EditableVideoEdits.class.getClassLoader()));
                g.e(parcel.readString());
                if (parcel.readByte() != 0) {
                    z = true;
                }
                g.c(z);
                return g.a();
            case 9:
                return new ReelSequenceController$PendingContinuation(parcel);
            case 10:
                return new ReelSequenceNavigator$ReelSequenceNavigatorState(parcel);
            case 11:
                return new UploadFrontendIdMapHelper(parcel);
            case 12:
                return new PlaylistEditorFragment$EditorState(parcel);
            case 13:
                return new AutoValue_PanePanelsController_PanePanelsState((PaneFragmentPanelDescriptor) parcel.readParcelable(PanePanelsController$PanePanelsState.class.getClassLoader()), (PaneFragmentPanelDescriptor) parcel.readParcelable(PanePanelsController$PanePanelsState.class.getClassLoader()));
            case 14:
                return new AutoValue_PanelFragmentDescriptor((Class) parcel.readSerializable(), (AccountId) parcel.readParcelable(PanelFragmentDescriptor.class.getClassLoader()));
            case 15:
                return new AutoValue_PanelsBackStack(parcel.readArrayList(PanelsBackStack.class.getClassLoader()));
            case 16:
                return new PanelsBackStack.PanelsBackStackEntry(parcel);
            case 17:
                return new MdxWatchDrawerLayout.SavedState(parcel);
            case 18:
                return new SwipeToContainerFrameLayout.SavedState(parcel);
            case 19:
                return new WatchHistoryListIterator(parcel);
            default:
                int readInt2 = parcel.readInt();
                if (readInt2 == 0) {
                    return SetOperationType.AUTOPLAY;
                }
                if (readInt2 == 1) {
                    return SetOperationType.MUTED_AUTOPLAY;
                }
                if (readInt2 == 2) {
                    return SetOperationType.START;
                }
                throw new IllegalArgumentException("Invalid id argument");
        }
    }
}
