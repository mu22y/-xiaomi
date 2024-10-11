/*
 * Copyright (c) 2010-2011, The MiCode Open Source Community (www.micode.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.micode.notes.data;

import android.net.Uri;
public class Notes {
    public static final String AUTHORITY = "micode_notes";
    public static final String TAG = "Notes";
    //定义基本信息，认证信息和日志发出者。 @齐祥栋

    public static final int TYPE_NOTE     = 0;
    public static final int TYPE_FOLDER   = 1;
    public static final int TYPE_SYSTEM   = 2;
    //三种note表的类。 @齐祥栋



    /**
     * Following IDs are system folders' identifiers
     * {@link Notes#ID_ROOT_FOLDER } is default folder
     * {@link Notes#ID_TEMPARAY_FOLDER } is for notes belonging no folder
     * {@link Notes#ID_CALL_RECORD_FOLDER} is to store call records
     */
    public static final int ID_ROOT_FOLDER = 0;                   //默认文件夹。 @齐祥栋
    public static final int ID_TEMPARAY_FOLDER = -1;              //笔记（不属于文件夹）  @齐祥栋
    public static final int ID_CALL_RECORD_FOLDER = -2;           //通话记录，便于返回。  @齐祥栋
    public static final int ID_TRASH_FOLER = -3;                  //垃圾回收站。  @齐祥栋
    //四种文件夹。用来存储信息。





    public static final String INTENT_EXTRA_ALERT_DATE = "net.micode.notes.alert_date";
    public static final String INTENT_EXTRA_BACKGROUND_ID = "net.micode.notes.background_color_id";
    public static final String INTENT_EXTRA_WIDGET_ID = "net.micode.notes.widget_id";
    public static final String INTENT_EXTRA_WIDGET_TYPE = "net.micode.notes.widget_type";
    public static final String INTENT_EXTRA_FOLDER_ID = "net.micode.notes.folder_id";
    public static final String INTENT_EXTRA_CALL_DATE = "net.micode.notes.call_date";

    public static final int TYPE_WIDGET_INVALIDE      = -1;
    public static final int TYPE_WIDGET_2X            = 0;
    public static final int TYPE_WIDGET_4X            = 1;






    public static class DataConstants {      //两种数据类型。@齐祥栋
        public static final String NOTE = TextNote.CONTENT_ITEM_TYPE;   //文本便签（textnote）@齐祥栋
        public static final String CALL_NOTE = CallNote.CONTENT_ITEM_TYPE;  //通话记录（callnote） @齐祥栋
    }








    /**
     * Uri to query all notes and folders
     */
    public static final Uri CONTENT_NOTE_URI = Uri.parse("content://" + AUTHORITY + "/note");

    /**
     * Uri to query data
     */
    public static final Uri CONTENT_DATA_URI = Uri.parse("content://" + AUTHORITY + "/data");
    //访问笔记、文件和数据的uri。@齐祥栋








    public interface NoteColumns {                     //静态的最忠的字符串常量，表示数据库里的列名。@齐祥栋
        /**
         * The unique ID for a row
         * <P> Type: INTEGER (long) </P>
         */
        public static final String ID = "_id";         //ID  @齐祥栋

        /**
         * The parent's id for note or folder
         * <P> Type: INTEGER (long) </P>
         */
        public static final String PARENT_ID = "parent_id";   //父ID   @齐祥栋

        /**
         * Created data for note or folder
         * <P> Type: INTEGER (long) </P>
         */
        public static final String CREATED_DATE = "created_date";   //创建日期  @齐祥栋

        /**
         * Latest modified date
         * <P> Type: INTEGER (long) </P>
         */
        public static final String MODIFIED_DATE = "modified_date";    //修改日期 @齐祥栋


        /**
         * Alert date
         * <P> Type: INTEGER (long) </P>
         */
        public static final String ALERTED_DATE = "alert_date";  //提醒日期  @齐祥栋

        /**
         * Folder's name or text content of note
         * <P> Type: TEXT </P>
         */
        public static final String SNIPPET = "snippet";     //标签名。 @齐祥栋

        /**
         * Note's widget id
         * <P> Type: INTEGER (long) </P>
         */
        public static final String WIDGET_ID = "widget_id";     //小部件ID  @齐祥栋

        /**
         * Note's widget type
         * <P> Type: INTEGER (long) </P>
         */
        public static final String WIDGET_TYPE = "widget_type"; //小部件类型。 @齐祥栋

        /**
         * Note's background color's id
         * <P> Type: INTEGER (long) </P>
         */
        public static final String BG_COLOR_ID = "bg_color_id";  //背景颜色的ID  @齐祥栋

        /**
         * For text note, it doesn't has attachment, for multi-media
         * note, it has at least one attachment
         * <P> Type: INTEGER </P>
         */
        public static final String HAS_ATTACHMENT = "has_attachment";  //附件  @齐祥栋

        /**
         * Folder's count of notes
         * <P> Type: INTEGER (long) </P>
         */
        public static final String NOTES_COUNT = "notes_count"; //标签数量 @齐祥栋

        /**
         * The file type: folder or note
         * <P> Type: INTEGER </P>
         */
        public static final String TYPE = "type"; //标签类型  @齐祥栋

        /**
         * The last sync id
         * <P> Type: INTEGER (long) </P>
         */
        public static final String SYNC_ID = "sync_id";     //最后一个同步的id @齐祥栋

        /**
         * Sign to indicate local modified or not
         * <P> Type: INTEGER </P>
         */
        public static final String LOCAL_MODIFIED = "local_modified";  //本地修改标签。 @齐祥栋

        /**
         * Original parent id before moving into temporary folder
         * <P> Type : INTEGER </P>
         */
        public static final String ORIGIN_PARENT_ID = "origin_parent_id";   //移动前iD @齐祥栋

        /**
         * The gtask id
         * <P> Type : TEXT </P>
         */
        public static final String GTASK_ID = "gtask_id";   //谷歌任务id  @齐祥栋

        /**
         * The version code
         * <P> Type : INTEGER (long) </P>
         */
        public static final String VERSION = "version";  //代码版本 @齐祥栋
    }







    public interface DataColumns {            //同上notecolumns 是静态常量， 数据库中的列名。  @齐祥栋
        /**
         * The unique ID for a row
         * <P> Type: INTEGER (long) </P>
         */
        public static final String ID = "_id";

        /**
         * The MIME type of the item represented by this row.
         * <P> Type: Text </P>
         */
        public static final String MIME_TYPE = "mime_type";
                                          //***mime类型用于标识文档文件或者字节流的性质和格式
                                            //可以标识不同的数据类型。例如文本图片和音频视频。@齐祥栋
        /**
         * The reference id to note that this data belongs to
         * <P> Type: INTEGER (long) </P>
         */
        public static final String NOTE_ID = "note_id";

        /**
         * Created data for note or folder
         * <P> Type: INTEGER (long) </P>
         */
        public static final String CREATED_DATE = "created_date";

        /**
         * Latest modified date
         * <P> Type: INTEGER (long) </P>
         */
        public static final String MODIFIED_DATE = "modified_date";

        /**
         * Data's content
         * <P> Type: TEXT </P>
         */
        public static final String CONTENT = "content";


        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * integer data type
         * <P> Type: INTEGER </P>
         */
        public static final String DATA1 = "data1";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * integer data type
         * <P> Type: INTEGER </P>
         */
        public static final String DATA2 = "data2";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * TEXT data type
         * <P> Type: TEXT </P>
         */
        public static final String DATA3 = "data3";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * TEXT data type
         * <P> Type: TEXT </P>
         */
        public static final String DATA4 = "data4";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * TEXT data type
         * <P> Type: TEXT </P>
         */
        public static final String DATA5 = "data5";
    }











//以下是datacolumns的实现类，是文本标签和通话记录的实体部分。@齐祥栋

    public static final class TextNote implements DataColumns {
        /**
         * Mode to indicate the text in check list mode or not
         * <P> Type: Integer 1:check list mode 0: normal mode </P>
         */

        //定义textnote
        public static final String MODE = DATA1;      //模式被存储在data1的列里面 @齐祥栋

        public static final int MODE_CHECK_LIST = 1;  //列表的检索模式为1 @齐祥栋

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/text_note";  //mime类型，标识文本标签目录

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/text_note";//mime类型，标识文本标签的单个项。

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/text_note");
    }       //文本标签内容提供者的URI，访问文本标签数据。






    //**同上**
    public static final class CallNote implements DataColumns {
        /**
         * Call date for this record
         * <P> Type: INTEGER (long) </P>
         */
        public static final String CALL_DATE = DATA1;

        /**
         * Phone number for this record
         * <P> Type: TEXT </P>
         */
        public static final String PHONE_NUMBER = DATA3;

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/call_note";

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/call_note";

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/call_note");
    }
}
