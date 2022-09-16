package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: adil  reason: default package */
/* loaded from: classes.dex */
public enum adil {
    ADD_VIDEO("addVideo"),
    ADD_VIDEOS("addVideos"),
    AD_PLAYING("adPlaying"),
    ON_AD_INFO_CHANGED("onAdInfoChange"),
    ON_AD_STATE_CHANGED("onAdStateChange"),
    CLEAR_PLAYLIST("clearPlaylist"),
    CONFIRM_PLAYLIST_UPDATE("confirmPlaylistUpdate"),
    INSERT_VIDEO("insertVideo"),
    INSERT_VIDEOS("insertVideos"),
    LOUNGE_STATUS("loungeStatus"),
    MOVE_VIDEO("moveVideo"),
    NEXT("next"),
    NOOP("noop"),
    NOW_PLAYING("nowPlaying"),
    NOW_PLAYING_PLAYLIST("nowPlayingPlaylist"),
    ON_SUBTITLES_TRACK_CHANGED("onSubtitlesTrackChanged"),
    PAUSE("pause"),
    PLAY("play"),
    PLAYLIST_MODIFIED("playlistModified"),
    PREVIOUS("previous"),
    REMOVE_VIDEO("removeVideo"),
    SCREEN_DISCONNECTED("loungeScreenDisconnected"),
    SEEK_TO("seekTo"),
    SET_AUDIO_TRACK("setAudioTrack"),
    SET_PLAYLIST("setPlaylist"),
    SET_SUBTITLES_TRACK("setSubtitlesTrack"),
    SET_VIDEO("setVideo"),
    SET_VOLUME("setVolume"),
    ON_VOLUME_CHANGED("onVolumeChanged"),
    SHOW_QR_CODE("showQrCode"),
    SKIP_AD("skipAd"),
    ON_STATE_CHANGED("onStateChange"),
    STOP("stopVideo"),
    NOW_AUTONAVING("nowAutoplaying"),
    AUTONAV_DISMISSED("autoplayDismissed"),
    DISMISS_AUTONAV("dismissAutoplay"),
    AUTONAV_UP_NEXT("autoplayUpNext"),
    ON_AUTONAV_MODE_CHANGED("onAutoplayModeChanged"),
    SET_AUTONAV_MODE("setAutoplayMode"),
    ON_AUDIO_TRACK_LIST_CHANGED("onAudioTrackListChanged"),
    ON_AUDIO_TRACK_CHANGED("onAudioTrackChanged"),
    ON_USER_ACTIVITY("onUserActivity"),
    ON_PLAYLIST_MODE_CHANGED("onPlaylistModeChanged"),
    SET_PLAYLIST_MODE("setPlaylistMode"),
    ON_LOOP_MODE_CHANGED("onLoopModeChanged"),
    SET_LOOP_MODE("setLoopMode"),
    GRACEFUL_RECONNECT("gracefulReconnect"),
    SEND_DEBUG_COMMAND("sendDebugCommand"),
    CUSTOM("custom"),
    MDX_SESSION_STATUS("mdxSessionStatus"),
    MDX_REMOTE_STATUS("mdxRemoteStatus"),
    ENCRYPTION("mdxEncrypted"),
    REQUEST_ASSISTED_SIGN_IN("requestAssistedSignIn"),
    VOICE_COMMAND("voiceCommand"),
    DPAD_COMMAND("dpadCommand"),
    SET_IMPACTED_SESSIONS_SERVER_EVENT("setImpactedSessionsServerEvent"),
    ON_HAS_PREVIOUS_NEXT_CHANGED("onHasPreviousNextChanged"),
    HEARTBEAT("heartbeat"),
    ON_HEARTBEAT_RECEIVED("onHeartbeatReceived"),
    START_SIGN_IN("startSignIn"),
    ON_SIGN_IN_STARTED("onSignInStarted");
    
    public static final amvn aj;
    public static final amvn ak;
    private static final Map am;
    public final String al;

    static {
        adil[] values;
        adil adilVar = NEXT;
        adil adilVar2 = PAUSE;
        adil adilVar3 = PLAY;
        adil adilVar4 = PREVIOUS;
        adil adilVar5 = SEEK_TO;
        adil adilVar6 = SET_AUDIO_TRACK;
        adil adilVar7 = SET_SUBTITLES_TRACK;
        adil adilVar8 = SET_VOLUME;
        adil adilVar9 = SKIP_AD;
        adil adilVar10 = STOP;
        adil adilVar11 = ON_USER_ACTIVITY;
        adil adilVar12 = SEND_DEBUG_COMMAND;
        adil adilVar13 = MDX_REMOTE_STATUS;
        adil adilVar14 = ENCRYPTION;
        adil adilVar15 = VOICE_COMMAND;
        adil adilVar16 = DPAD_COMMAND;
        am = new HashMap();
        aj = amvn.w(adilVar, adilVar11, adilVar2, adilVar3, adilVar4, adilVar5, adilVar12, adilVar8, adilVar9, adilVar10, adilVar13, adilVar14, adilVar15, adilVar16);
        amvn.s(adilVar6, adilVar7);
        ak = amvn.s(adilVar13, adilVar14);
        for (adil adilVar17 : values()) {
            am.put(adilVar17.al, adilVar17);
        }
    }

    adil(String str) {
        this.al = str;
    }

    public static adil a(String str) {
        return (adil) am.get(str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.al;
    }
}
