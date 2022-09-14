package defpackage;

import com.google.android.filament.R;
import java.io.File;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: avcd  reason: default package */
/* loaded from: classes2.dex */
final class avcd implements cvib {
    final /* synthetic */ avce a;
    private final String b;
    private final File c;

    public avcd(avce avceVar, String str, File file) {
        this.a = avceVar;
        this.b = str;
        this.c = file;
    }

    @Override // defpackage.cvib
    public final void a(File file, cvia cviaVar) {
        dlqg bK;
        String str = this.b;
        if (cviaVar.a == cvhz.CANCELED) {
            dlpy bZ = dlqg.c.bZ();
            dlqa dlqaVar = dlqa.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlqg dlqgVar = (dlqg) bZ.b;
            dlqaVar.getClass();
            dlqgVar.b = dlqaVar;
            dlqgVar.a = 3;
            bK = bZ.bK();
        } else {
            dlqb bZ2 = dlqd.e.bZ();
            int ordinal = cviaVar.a.ordinal();
            int i = 10;
            if (ordinal != 0) {
                switch (ordinal) {
                    case 2:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar = (dlqd) bZ2.b;
                        dlqdVar.b = 1;
                        dlqdVar.a |= 1;
                        break;
                    case 3:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar2 = (dlqd) bZ2.b;
                        dlqdVar2.b = 2;
                        int i2 = dlqdVar2.a | 1;
                        dlqdVar2.a = i2;
                        int i3 = cviaVar.b;
                        dlqdVar2.a = i2 | 2;
                        dlqdVar2.c = i3;
                        break;
                    case 4:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar3 = (dlqd) bZ2.b;
                        dlqdVar3.b = 3;
                        dlqdVar3.a |= 1;
                        break;
                    case 5:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar4 = (dlqd) bZ2.b;
                        dlqdVar4.b = 4;
                        dlqdVar4.a |= 1;
                        break;
                    case 6:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar5 = (dlqd) bZ2.b;
                        dlqdVar5.b = 5;
                        dlqdVar5.a |= 1;
                        break;
                    case 7:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar6 = (dlqd) bZ2.b;
                        dlqdVar6.b = 6;
                        dlqdVar6.a |= 1;
                        break;
                    case 8:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar7 = (dlqd) bZ2.b;
                        dlqdVar7.b = 7;
                        dlqdVar7.a |= 1;
                        break;
                    case 9:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar8 = (dlqd) bZ2.b;
                        dlqdVar8.b = 8;
                        dlqdVar8.a |= 1;
                        break;
                    case 10:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar9 = (dlqd) bZ2.b;
                        dlqdVar9.b = 9;
                        dlqdVar9.a |= 1;
                        break;
                    case 11:
                        if (bZ2.c) {
                            bZ2.bF();
                            bZ2.c = false;
                        }
                        dlqd dlqdVar10 = (dlqd) bZ2.b;
                        dlqdVar10.b = 10;
                        dlqdVar10.a |= 1;
                        break;
                    default:
                        throw new IllegalArgumentException("Unexpected DownloadFailure type.");
                }
            } else {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dlqd dlqdVar11 = (dlqd) bZ2.b;
                dlqdVar11.b = 0;
                dlqdVar11.a |= 1;
            }
            if (!awmj.a.contains(cviaVar.a)) {
                i = 0;
            } else {
                String str2 = cviaVar.c;
                if (!dbsj.d(str2)) {
                    String lowerCase = str2.toLowerCase(Locale.getDefault());
                    i = lowerCase.equals("canceled") ? 102 : lowerCase.equals("tls tunnel buffered too many bytes!") ? R.styleable.AppCompatTheme_textAppearanceListItem : lowerCase.equals("failed to authenticate with proxy") ? 104 : lowerCase.startsWith("unexpected response code for connect:") ? 105 : lowerCase.startsWith("expected \\\"\\\" but was") ? R.styleable.AppCompatTheme_textAppearancePopupMenuHeader : lowerCase.startsWith("expected an int but was") ? R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle : lowerCase.equals("exception in connect") ? R.styleable.AppCompatTheme_textAppearanceSearchResultTitle : lowerCase.startsWith("unexpected end of stream on") ? R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu : lowerCase.startsWith("unexpected protocol:") ? R.styleable.AppCompatTheme_textColorAlertDialogListItem : lowerCase.equals("shutdown") ? R.styleable.AppCompatTheme_textColorSearchUrl : lowerCase.equals("stream closed") ? R.styleable.AppCompatTheme_toolbarNavigationButtonStyle : lowerCase.startsWith("cannot buffer entire body for content length:") ? R.styleable.AppCompatTheme_toolbarStyle : lowerCase.equals("content-Length and stream length disagree") ? R.styleable.AppCompatTheme_tooltipForegroundColor : lowerCase.startsWith("failed to delete") ? R.styleable.AppCompatTheme_tooltipFrameBackground : lowerCase.startsWith("failed to rename") ? R.styleable.AppCompatTheme_viewInflaterClass : lowerCase.startsWith("not a readable directory") ? R.styleable.AppCompatTheme_windowActionBar : lowerCase.equals("closed") ? R.styleable.AppCompatTheme_windowActionBarOverlay : lowerCase.startsWith("expected a connection header but was") ? R.styleable.AppCompatTheme_windowActionModeOverlay : lowerCase.startsWith("frame_size_error") ? R.styleable.AppCompatTheme_windowFixedHeightMajor : lowerCase.equals("protocol_error: type_headers streamId == 0") ? R.styleable.AppCompatTheme_windowFixedHeightMinor : lowerCase.equals("protocol_error: flag_compressed without settings_compress_data") ? R.styleable.AppCompatTheme_windowFixedWidthMajor : lowerCase.startsWith("type_priority length:") ? R.styleable.AppCompatTheme_windowFixedWidthMinor : lowerCase.equals("type_priority streamid == 0") ? R.styleable.AppCompatTheme_windowMinWidthMajor : lowerCase.startsWith("type_rst_stream length:") ? R.styleable.AppCompatTheme_windowMinWidthMinor : lowerCase.equals("type_rst_stream streamid == 0") ? R.styleable.AppCompatTheme_windowNoTitle : lowerCase.startsWith("type_rst_stream unexpected error code:") ? 127 : lowerCase.equals("type_settings streamid != 0") ? 128 : lowerCase.equals("frame_size_error ack frame should be empty!") ? 129 : lowerCase.startsWith("type_settings length % 6 != 0:") ? 130 : lowerCase.equals("protocol_error settings_enable_push != 0 or 1") ? 131 : lowerCase.equals("protocol_error settings_initial_window_size > 2^31 - 1") ? 132 : lowerCase.startsWith("protocol_error settings_max_frame_size:") ? 133 : lowerCase.startsWith("protocol_error invalid settings id:") ? 134 : lowerCase.equals("protocol_error: type_push_promise streamid == 0") ? 135 : lowerCase.startsWith("type_ping length != 8:") ? 136 : lowerCase.equals("type_ping streamid != 0") ? 137 : lowerCase.startsWith("type_goaway length < 8:") ? 138 : lowerCase.equals("type_goaway streamid != 0") ? 139 : lowerCase.startsWith("type_goaway unexpected error code:") ? 140 : lowerCase.startsWith("type_window_update length !=4:") ? 141 : lowerCase.equals("windowsizeincrement was 0") ? 142 : lowerCase.endsWith("!= type_continuation") ? 143 : lowerCase.equals("type_continuation streamid changed") ? 144 : (!lowerCase.startsWith("protocol_error padding") || !lowerCase.contains("remaining length")) ? lowerCase.startsWith("type_window_update length") ? 146 : lowerCase.startsWith("type_ping length:") ? 147 : lowerCase.startsWith("type_goaway length:") ? 148 : lowerCase.startsWith("type_settings length:") ? 149 : lowerCase.startsWith("unexpected journal header:") ? 150 : lowerCase.startsWith("unexpected journal line:") ? 151 : lowerCase.equals("index == 0") ? 152 : lowerCase.startsWith("invalid dynamic table size update") ? 153 : lowerCase.startsWith("header index too large") ? 154 : lowerCase.startsWith("protocol_error response malformed: mixed case name:") ? 155 : lowerCase.startsWith("stream was reset:") ? 156 : lowerCase.equals("stream finished") ? 157 : lowerCase.startsWith("numberOfPairs < 0:") ? 158 : lowerCase.startsWith("numberOfPairs > 1024:") ? 159 : lowerCase.equals("name.size == 0") ? 160 : lowerCase.equals("compressedLimit > 0:") ? 161 : lowerCase.equals("thread interrupted") ? 201 : lowerCase.equals("deadline reached") ? 202 : lowerCase.equals("gzip finished without exhausting source") ? 203 : lowerCase.equals("timeout") ? 204 : lowerCase.startsWith("\\\\n not found: size=") ? 205 : lowerCase.equals("source exhausted prematurely") ? 206 : lowerCase.startsWith("number too large:") ? 207 : lowerCase.startsWith("size <") ? 208 : lowerCase.equals("attempt to write after finish") ? 301 : lowerCase.equals("the stream is corrupted") ? 302 : lowerCase.startsWith("error reading data for") ? 303 : lowerCase.startsWith("size mismatch on inflated file:") ? 304 : lowerCase.equals("stream is closed") ? 305 : lowerCase.equals("mark/reset not supported") ? 306 : lowerCase.equals("pushbackreader is closed") ? 307 : lowerCase.equals("reader is closed") ? 308 : lowerCase.equals("pushback buffer full") ? 309 : lowerCase.startsWith("byteCount < 0:") ? 310 : lowerCase.equals("stringreader is closed") ? 311 : lowerCase.startsWith("offset < 0:") ? 312 : lowerCase.equals("bufferedreader is closed") ? 313 : lowerCase.equals("invalid mark") ? 314 : lowerCase.equals("bufferedwriter is closed") ? 315 : lowerCase.equals("pipe already connected") ? 316 : lowerCase.equals("not connected") ? 317 : lowerCase.equals("inputstream is closed") ? 318 : (lowerCase.equals("pipe broken") || lowerCase.equals("pipe is broken")) ? 319 : lowerCase.equals("pipe is closed") ? 320 : lowerCase.equals("unable to connect to socks server") ? 321 : lowerCase.equals("invalid socks client") ? 322 : lowerCase.equals("malformed reply from socks server") ? 323 : lowerCase.equals("failure to connect to socks server") ? 324 : lowerCase.equals("unable to connect to identd to verify user") ? 325 : lowerCase.equals("failure - user ids do not match") ? 326 : lowerCase.equals("already connected") ? 327 : lowerCase.equals("pipe already connected") ? 328 : lowerCase.equals("pipe not connected") ? 329 : lowerCase.equals("inputstreamreader is closed") ? 330 : lowerCase.equals("bufferedinputstream is closed") ? 331 : lowerCase.equals("mark has been invalidated.") ? 332 : lowerCase.equals("bufferedoutputstream is closed") ? 333 : lowerCase.startsWith("zip entry size (") ? 334 : lowerCase.equals("error while finalizing cipher") ? 335 : lowerCase.equals("parameter has already been initialized") ? 336 : lowerCase.equals("parameter has not been initialized") ? 337 : lowerCase.startsWith("not a multicast group:") ? 338 : lowerCase.equals("chararrayreader is closed") ? 339 : lowerCase.equals("outputstreamwriter is closed") ? 340 : lowerCase.equals("pushbackinputstream is closed") ? 341 : lowerCase.equals("name neither a string nor a byte[]") ? 342 : lowerCase.equals("encoded.length == 0") ? 343 : lowerCase.equals("name == null") ? 345 : lowerCase.equals("out == null") ? 346 : lowerCase.equals("charsetname == null") ? 347 : lowerCase.equals("format == null") ? 348 : lowerCase.equals("file == null") ? 349 : lowerCase.equals("fd == null") ? 350 : lowerCase.equals("buffer == null") ? 351 : lowerCase.equals("lock == null") ? 352 : awmj.a(cviaVar.a) : 145;
                } else if (!str.startsWith("data:")) {
                    i = cvie.a(str) ? 11 : awmj.a(cviaVar.a);
                }
            }
            if (i != 0) {
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dlqd dlqdVar12 = (dlqd) bZ2.b;
                dlqdVar12.a |= 4;
                dlqdVar12.d = i;
            }
            dlpy bZ3 = dlqg.c.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dlqg dlqgVar2 = (dlqg) bZ3.b;
            dlqd bK2 = bZ2.bK();
            bK2.getClass();
            dlqgVar2.b = bK2;
            dlqgVar2.a = 2;
            bK = bZ3.bK();
        }
        this.a.a.b(this.b, bK);
    }

    @Override // defpackage.cvib
    public final void b(File file) {
        dlpy bZ = dlqg.c.bZ();
        dlqe bZ2 = dlqf.d.bZ();
        String absolutePath = file.getAbsolutePath();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlqf dlqfVar = (dlqf) bZ2.b;
        absolutePath.getClass();
        dlqfVar.a |= 1;
        dlqfVar.b = absolutePath;
        String absolutePath2 = this.c.getAbsolutePath();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dlqf dlqfVar2 = (dlqf) bZ2.b;
        absolutePath2.getClass();
        dlqfVar2.a |= 2;
        dlqfVar2.c = absolutePath2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlqg dlqgVar = (dlqg) bZ.b;
        dlqf bK = bZ2.bK();
        bK.getClass();
        dlqgVar.b = bK;
        dlqgVar.a = 1;
        this.a.a.b(this.b, bZ.bK());
    }
}
