package com.google.android.apps.youtube.embeddedplayer.service.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.EmbedsPrewarmData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.SubscribeButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.WatchLaterButtonData;
import com.google.android.exoplayer.ColorInfo;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public m() {
    }

    public m(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new VideoDetailsCollapsed[i];
            case 1:
                return new VideoDetails[i];
            case 2:
                return new VideoDetailsExpanded[i];
            case 3:
                return new EmbedsPrewarmData[i];
            case 4:
                return new SubscribeButtonData[i];
            case 5:
                return new SubscriptionNotificationButtonData[i];
            case 6:
                return new SubscriptionNotificationMenuData[i];
            case 7:
                return new SubscriptionNotificationMenuItem[i];
            case 8:
                return new WatchLaterButtonData[i];
            case 9:
                return new ColorInfo[0];
            case 10:
                return new MediaFormat[i];
            case 11:
                return new Format[i];
            case 12:
                return new DrmInitData[i];
            case 13:
                return new DrmInitData.SchemeData[i];
            case 14:
                return new Metadata[i];
            case 15:
                return new AppInfoTable[i];
            case 16:
                return new EventMessage[i];
            case 17:
                return new PictureFrame[i];
            case 18:
                return new VorbisComment[i];
            case 19:
                return new IcyHeaders[i];
            default:
                return new IcyInfo[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        aoob x;
        aoob x2;
        aoob aoobVar;
        aoob x3;
        aoob x4;
        aoob x5;
        switch (this.a) {
            case 0:
                CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray == null) {
                    x = aoob.b;
                } else {
                    x = aoob.x(createByteArray);
                }
                n d = VideoDetailsCollapsed.d();
                d.a = charSequence;
                d.b = charSequence2;
                d.b(x);
                return d.a();
            case 1:
                l c = VideoDetails.c();
                c.b((VideoDetailsCollapsed) VideoDetailsCollapsed.CREATOR.createFromParcel(parcel));
                c.c((VideoDetailsExpanded) VideoDetailsExpanded.CREATOR.createFromParcel(parcel));
                return c.a();
            case 2:
                CharSequence charSequence3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                CharSequence charSequence4 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                byte[] createByteArray2 = parcel.createByteArray();
                if (createByteArray2 == null) {
                    x2 = aoob.b;
                } else {
                    x2 = aoob.x(createByteArray2);
                }
                o d2 = VideoDetailsExpanded.d();
                d2.a = charSequence3;
                d2.b = charSequence4;
                d2.b(x2);
                return d2.a();
            case 3:
                com.google.android.apps.youtube.embeddedplayer.service.prewarm.model.a c2 = EmbedsPrewarmData.c();
                c2.b(parcel.readInt());
                String readString = parcel.readString();
                readString.getClass();
                c2.c(readString);
                return c2.a();
            case 4:
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscribebutton.model.a e = SubscribeButtonData.e();
                e.b(parcel.readInt());
                e.a = parcel.readString();
                e.b = parcel.readString();
                byte[] createByteArray3 = parcel.createByteArray();
                if (createByteArray3 != null) {
                    aoobVar = aoob.x(createByteArray3);
                } else {
                    aoobVar = aoob.b;
                }
                e.c(aoobVar);
                return e.a();
            case 5:
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.a e2 = SubscriptionNotificationButtonData.e();
                e2.c(parcel.readInt());
                e2.b(parcel.readInt());
                e2.a = parcel.readString();
                byte[] createByteArray4 = parcel.createByteArray();
                if (createByteArray4 == null) {
                    x3 = aoob.b;
                } else {
                    x3 = aoob.x(createByteArray4);
                }
                e2.d(x3);
                return e2.a();
            case 6:
                SubscriptionNotificationMenuItem[] subscriptionNotificationMenuItemArr = (SubscriptionNotificationMenuItem[]) parcel.createTypedArray(SubscriptionNotificationMenuItem.CREATOR);
                if (subscriptionNotificationMenuItemArr == null) {
                    return new SubscriptionNotificationMenuData(new ArrayList());
                }
                return new SubscriptionNotificationMenuData(Arrays.asList(subscriptionNotificationMenuItemArr));
            case 7:
                com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.b g = SubscriptionNotificationMenuItem.g();
                g.d(parcel.readInt());
                g.c(parcel.readByte() != 0);
                g.b(parcel.readInt());
                g.a = parcel.readString();
                g.b = parcel.readString();
                byte[] createByteArray5 = parcel.createByteArray();
                if (createByteArray5 == null) {
                    x4 = aoob.b;
                } else {
                    x4 = aoob.x(createByteArray5);
                }
                g.e(x4);
                return g.a();
            case 8:
                com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.model.a e3 = WatchLaterButtonData.e();
                e3.b(parcel.readInt());
                e3.a = parcel.readString();
                e3.b = parcel.readString();
                byte[] createByteArray6 = parcel.createByteArray();
                if (createByteArray6 == null) {
                    x5 = aoob.b;
                } else {
                    x5 = aoob.x(createByteArray6);
                }
                e3.c(x5);
                return e3.a();
            case 9:
                return new ColorInfo(parcel);
            case 10:
                return new MediaFormat(parcel);
            case 11:
                return new Format(parcel);
            case 12:
                return new DrmInitData(parcel);
            case 13:
                return new DrmInitData.SchemeData(parcel);
            case 14:
                return new Metadata(parcel);
            case 15:
                String readString2 = parcel.readString();
                ptx.a(readString2);
                return new AppInfoTable(parcel.readInt(), readString2);
            case 16:
                return new EventMessage(parcel);
            case 17:
                return new PictureFrame(parcel);
            case 18:
                return new VorbisComment(parcel);
            case 19:
                return new IcyHeaders(parcel);
            default:
                return new IcyInfo(parcel);
        }
    }
}
