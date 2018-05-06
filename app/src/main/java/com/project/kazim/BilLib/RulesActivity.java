package com.project.kazim.BilLib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class RulesActivity extends AppCompatActivity {

    private final String rulesLibrary ="****General Rules**** \n\n" +
            "Bilkent University Library resources and services are only available to: members of Bilkent University; Bilkent University alumni; academic staff from the other Turkish universities with protocol agreements; and non-Bilkent academics and graduate students (Master's and Ph.D.) who have individual membership of the library.\n" +
            "The library collection is protected by an electronic checkpoint at the exit. If necessary you may be subject to a body and bag search by the security staff.\n" +
            "Bilkent University ID card must be scanned at the entrance.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "No smoking in the Library.\n" +
            "Food may only be consumed in the Library cafeteria areas.\n" +
            "Mobile phones may not be used in the reading rooms.\n" +
            "Library users should be quiet in library study halls and corridors; otherwise, users will be notified by library staff or security officers.\n" +
            "Circulation Rules \n" +
            "Bilkent Users \n" +
            "Borrowing Books, Bound Journals and Non-Book Materials\n" +
            "Overdue and Lost Books, Bound Journals and Non-Book Materials\n" +
            "Reserve Material\n" +
            "\n" +
            "****Bilkent Users**** \n\n" +
            "1. Borrowing Books, Bound Journals and Non-Book Materials \n\n" +
            "Bilkent University academic staff and research assistants may borrow up to 40 printed items (books, journals, etc.) and up to 15 multimedia items (DVDs, CDs, etc.) at any one time. Printed items are lent for 120 days, and multimedia items for 15 days.\n" +
            "Bilkent University part-time academic staff and graduate students may borrow up to 20 printed items (books, journals, etc.) and up to 7 multimedia items (DVDs, CDs, etc.) at any one time. Printed items are lent for 30 days, and multimedia items for 7 days.\n" +
            "Bilkent University undergraduates and administrative staff may borrow up to 15 printed items (books, journals, etc.) and up to 7 multimedia items (DVDs, CDs, etc.) at any one time. Printed items are lent for 15 days, and multimedia items for 7 days.\n" +
            "The loan-period of material which has not been \"reserved\" (hold) by another user may be extended twice online using My Library Account on the Library website. Materials to be renewed more than twice should be brought to the Library.\n" +
            "If a user has urgent need for an item which is currently on loan, the user can recall the item by contacting the Circulation Desk. Bilkent University Library reserves the right to recall borrowed material before the due date.\n" +
            "The Special, Inalcik, Hasan Âli Yücel Collections and the European Union Information Centre are governed by special rules.\n" +
            "Interlibrary loan and photocopy requests are governed by special rules.\n" +
            "\n" +
            "2. Overdue and Lost Books, Bound Journals and Non-Book Materials \n\n" +
            "Users will receive a reminder e-mail three days before the due-date of an individual item.\n" +
            "The Library will notify readers by e-mail when materials are past due. The borrower bears full responsibility for their timely return.\n" +
            "The current fine per book, journal or non-book item per day is charged for late returns.\n" +
            "In the case of loss of a book, journal or non-book item, the reader will be obliged to pay its replacement value in Turkish Liras at the Central Bank rate of exchange prevailing on the day of payment, plus the cost of processing the new item, according to material type. Together with the amount owing for late returns as of the date on which the item is reported as lost.\n" +
            "3. Reserve Materials \n\n" +
            "Printed reserve materials are located in the Reserve Sections of Main and East Campus Libraries.\n" +
            "The users can borrow reserve items for 2 hours with their ID card. If the item has not been requested by another user, the loan period may be extended for a further 2 hours.\n" +
            "An hour-based fine is applied to every reserve item that is returned late. This fine is two and a half times more than the daily late fee of regular library material.\n" +
            "Materials will be removed from the reserve collection or their placement in the collection will be extended according to the date on the Reserve Request Form.\n" +
            "The user can borrow the book or printed material delivered by academic staff. An ID card must be given to the library staff before removing printed documents from the centre for photocopying.\n" +
            "\n" +
            "Alumni \n" +
            "Registration\n" +
            "At the entrance\n" +
            "Borrowing\n" +
            "Overdue and Lost Books\n\n" +
            "1. Registration \n\n" +
            "The Registration Form, which is available on the library web page or from the Circulation Desk, should be completed and submitted with 2 photographs. If eligible, the applicant will receive a Bilkent University Alumnus User ID Card within one week.\n" +
            "In order to obtain a user card the applicant must pay a deposit to the Library, the amount to be determined at the beginning of each academic year. Upon cancelation of membership the deposit is paid back to the user after deduction of any amount owing for late returns or loss of a book.\n" +
            "Books are borrowed and returned on presentation of a Bilkent University Alumnus User ID Card. Books on loan to the user with their due dates may be viewed by selecting the My Library Account on a library OPAC terminal or on the library website.\n" +
            "2. At the Entrance\n \n" +
            "The library collection is protected by an electronic checkpoint at the exit.\n" +
            "If necessary, you may be subject to a body and bag search by the security staff.\n" +
            "Bilkent University Alumni User ID Card must be scanned at the entrance.\n" +
            "3. Borrowing \n\n" +
            "By paying a $90 deposit, alumni may borrow up to 2 printed items at a time for 30 days. By paying a $180 deposit they may borrow up 4 printed items at a time for 30 days.\n" +
            "The loan-period of material which has not been \"reserved\" (hold) by another user may be extended. Materials to be renewed should be brought to the Library.\n" +
            "If a user has urgent need for an item which is currently on loan, the user can recall the item by contacting the Circulation Desk. Bilkent University Library reserves the right to recall borrowed material before the due date.\n" +
            "4. Overdue and Lost Books \n\n" +
            "Users will receive a reminder e-mail three days before the due-date of an individual item.\n" +
            "The library will notify readers by e-mail when materials are past due. The borrower bears full responsibility for their timely return.\n" +
            "The current fine per book is charged for late returns.\n" +
            "For each item not returned on time, 1 penalty point will be incurred. When the total penalty points reach 10, the user will be prohibited from borrowing library material for one year. Even with only one item overdue for more than 10 days, the user also will be prohibited from borrowing library material for one year. If this occurs a second time membership will be terminated.\n" +
            "If the amount of fines accumulated for overdue books is over the limit announced at the beginning of the academic year, no further borrowing is permitted.\n" +
            "In the case of loss of a book, the reader will be obliged to pay its replacement value in Turkish Liras at the Central Bank rate of exchange prevailing on the day of payment, plus the cost of processing the new item, according to material type. Together with the amount owing for late returns as of the date on which the item is reported as lost.\n" +
            "\n" +
            "Library Membership\n" +
            "From other universities, academic staff and graduate students can be a member of our library and benefit from library services and resources for research activities.\n" +
            "For Library Membership:\n" +
            "Fill out membership form which is located on the Library web page. For application, entries in the library can be made by showing organization ID cards and membership form.\n" +
            "Annual membership fee must be paid to Circulation Desk by credit card.\n" +
            "Annual membership fee is 400 TL for academic staff, 250 TL for graduate students.\n" +
            "Candidates should come to library to “Circulation Desk\" and bring: \n" +
            "•\t\"Working document\" from their institution (for academic staff), \n" +
            "•\t\"student document \" (for graduate students), \n" +
            "•\tOne (1) photo, \n" +
            "•\tMembership form, \n" +
            "•\tOrganization ID cards \n" +
            "After completion of the membership process \"Library Membership Card\" which is valid for one (1) year will be delivered to members. By using \"Library Membership Card\" members can benefit from library services and resources in the library.\n" +
            "Membership is renewed at the beginning of each academic year.\n" +
            "Library Membership Card must be scanned at the entrance.\n" +
            "\n" +
            "Interlibrary Loan and Document Supply Rules \n" +
            "Bilkent University Community Usage Rules \n" +
            "Only Bilkent University academics, master's and doctoral students can use the ILL service.\n" +
            "ILL requests can be made: by coming to the Library in person; via the faculty librarians; or by completing the ILL Request Form on the Library website.\n" +
            "Users can request a maximum of 5 resources at the same time.\n" +
            "For material from libraries in Ankara with which Bilkent University has a protocol agreement, users must go themselves to borrow books. For libraries without a protocol agreement, Bilkent Unversity Library will collect the books. Document requests will be photocopied by Bilkent staff in the relevant library.\n" +
            "Books requested from libraries in Turkey will take at least 3 days to arrive; those from international libraries at least 15-20 days. The turnaround time depends on the availability of the item at the lending institution, the response time on the part of the lending institution, and shipping.\n" +
            "In order to collect the loan material or document from the Library, the user must sign the request form.\n" +
            "The requester must agree to use the material in accordance with copyright law.\n" +
            "Material which cannot be borrowed can only be consulted in the Library.\n" +
            "The borrowing period of ILL material varies according to the following rules:\n" +
            "material from Turkish libraries outside Ankara 30 days,\n" +
            "from foreign libraries may be borrowed for 15 days.\n" +
            "In order to renew a borrowed ILL item, the user should notify the ILL librarian 5 days before the due date. The turnaround and renewal time depends on the lending institution circulation rules.\n" +
            "If the user does not collect the requested material from the Library, the same resource cannot be requested again.\n" +
            "Once an ILL item has been borrowed, the user will be held responsible in the case of loss, damage or late return. In such cases, the lending institution circulation rules will be taken into consideration.\n" +
            "\n" +
            "Other Library Usage Rules \n" +
            "National \n" +
            "Bilkent University Library materials can only be loaned via ILL to academics, master's and doctoral students registered at other universities, and to libraries of government departments or commercial institutions.\n" +
            "Requests for completing the \"ILL Request Form\" on the Library website.\n" +
            "The printed \"Interlibrary Loan Form\" must be completed in triplicate, and should have the names, surnames and signatures of both the requester and the responsible librarian, as well as an official stamp. Otherwise, requests will not be acceptable.\n" +
            "All books may be requested except Reference, Reserve, Halil İnalcık Collection, Special Collection, European Documentation Centre, and USA Government Printing Office books. Non-book materials, easy books, weekly books, reserve thesis cannot be borrowed.\n" +
            "Art books may only be requested by academics in fine art, architecture, communication, archaeology and art history departments at other universities. A maximum of 2 books may be borrowed at the same time, in Ankara for 15 days, and in Turkey for 30 days.\n" +
            "Bilkent University Library books requested via ILL may be borrowed:\n" +
            "for 30 days by Turkish libraries outside Ankara,\n" +
            "External users can request a maximum of 5 resources at the same time.\n" +
            "The Library reserves the right to recall material loaned via ILL before the termination of the loan period.\n" +
            "Borrowed material can be renewed only once, as long as it is not been requested by another user.\n" +
            "For document requests, the requester library should pay a deposit to Bilkent University's bank account. For further information please call +90 (312) 290 29 66.\n" +
            "Requested materials are sent to the relevant library's ILL librarian C.O.D (cash on delivery).\n" +
            "The requester librarian will be responsible in cases of loss, damage or late return (2 TL per book, per day). In such cases, Bilkent University Library's circulation rules will be taken into consideration.\n" +
            "International \n" +
            "Requests from foreign institutions can be made by fax, e-mail or printed forms.\n" +
            "All books may be requested except Reference, Reserve, Halil İnalcık Collection, Special Collection, European Union Information Centre, and USA Government Printing Office books. Non-book materials cannot be borrowed.\n" +
            "Materials may be borrowed for 30 days.\n" +
            "For book or document requests, payment can be made by IFLA Voucher or bank referral. (For one book 4 IFLA vouchers, for one article 3 IFLA vouchers)\n" +
            "The requester librarian will be responsible in cases of loss, damage or late return. In such cases, Bilkent University Library's circulation rules will be taken into consideration.\n" +
            "\n" +
            "Art Collection Circulation and Usage Rules \n" +
            "Art books on reserve are located in the Reserve Collection and are issued like other reserve material.\n" +
            "Please do not re-shelve books in the Art Room. You may leave books on the study tables to be re-shelved by staff.\n" +
            "A form must be filled for the usage of the materials located in Art Room Storage Collection.\n" +
            "A form must be filled for photograph and video shooting in Art Room or Library.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "No smoking, eating and drinking in the Art Room.\n" +
            "Mobile phones may not be used in the Library.\n" +
            "Multimedia Room Circulation and Usage Rules \n" +
            "Multimedia Room Circulation Rules \n" +
            "Bilkent University academic staff and research assistants may borrow up to 15 multimedia items (DVDs, VCDs, music CDs) at any one time. Bilkent University part-time academic staff and graduate students may borrow up to 7 multimedia items (DVDs, VCDs, music CDs) at any one time. For detailed information, please see circulation rules.\n" +
            "Instrumental parts are issued as a set and must be returned together.\n" +
            "Braille music items may be borrowed by both members and non-members of Bilkent University. Up to 5 pieces of braille music may be borrowed at any one time for 15 days by ILL.\n" +
            "In the case of loss of Multimedia Room materials, the borrower will be obliged to pay its replacement value (including the binding price for printed music) in Turkish Liras at the Central Bank rate of exchange prevailing on the day of payment, plus the cost of processing the new item, acording to material type. Together with the amount owing for late returns as of the date on which the item is reported as lost. In the case of loss of any part of printed music, the user will be obliged to pay the price of the entire set.\n" +
            "No smoking and eating in the Multimedia Room study room, video watching booths and group study booths.\n" +
            "Anyone misusing or damaging Multimedia Room materials or premises will be subject to disciplinary measures.\n" +
            "Multimedia Room Group Study Booths Rules \n" +
            "The group study booths are intended primarily for group study. Users wishing to study individually in silence should use other study rooms in the Library.\n" +
            "Group study booths can be used on weekdays 8:30-23:00, and at weekends 9:00-17:00.\n" +
            "The booths may be reserved for up to 3 hours which, if there is no-one else waiting, may be extended. Library staff will inform the user when the time elapses, if another user is waiting.\n" +
            "Multimedia Room Video Booths Rules \n" +
            "Video Booths can be used for the duration of the film.\n" +
            "Booths number V.1 is for a maximum of 2 users; booths number V.2, V.3 and V.4 are for a maximum of 8 users.\n" +
            "For reservation, please call +90 (312) 290 26 86.\n" +
            "Students who use this room for inappropriate activities will be subject to disciplinary measure.\n" +
            "Multimedia Room Vinly Record Collection Usage Rules \n" +
            "The Vinyl Record Collection can be used on weekdays 8.30-23.00, and at weekends 9.00-17.00.\n" +
            "The vinyl records can only be consulted in Multimedia Room; they are not circulated.\n" +
            "Records can be listened to in Multimedia Room, Room V.3, for the duration of the recording.\n" +
            "\n" +
            "Microform Collection Usage Rules \n" +
            "The Microform Collection (microfiche and microfilms) is open to both Bilkent University members and outside users.\n" +
            "The Collection can be consulted on weekdays between 08.30 - 17.00.\n" +
            "Microforms can only be used in the Library and may not be checked out.\n" +
            "Microform machines can be reserved for half a day (between 08.30 - 13.00, or between 13.00 - 17.00) which, if no-one else requests to use the machine, may be extended.\n" +
            "Outsider users will be charged 50 krş. per scan from microforms.\n" +
            "No smoking, eating or drinking (except for water) when using the Microform Collection.\n" +
            "For any suggestions and to make an appointment, please call (312) 290 11 27.\n" +
            "European Union Information Centre Usage Rules \n" +
            "In accordance with the conditions of the European Commission, publications supplied by the Commission may not be borrowed.\n" +
            "The material may be consulted in the Centre between 08.30-17.00 during the week.\n" +
            "An ID card must be given to the library staff before removing printed documents from the Centre for photocopying.\n" +
            "Please do not re-shelve books. You may leave books on the study tables to be re-shelved by staff.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "No smoking, and eating in the Centre.\n" +
            "Mobile phones may not be used in the Centre.\n" +
            "USA Government Printing Office Usage Rules \n" +
            "The material may be consulted in the Centre between 08.30-17.00 during the week.\n" +
            "An ID card must be given to the library staff before removing printed documents from the Centre for photocopying.\n" +
            "Bilkent University members can search databases and CD-ROMs by logging on with their username and password; outside users can take a daily password from the reference librarians who are sitting in the Reference and Current Periodicals Rooms. For printouts, users must go to the photocopy centre and give their username.\n" +
            "Please do not re-shelve books. You may leave books on the study tables to be re-shelved by staff.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "No smoking and eating in the Centre.\n" +
            "Mobile phones may not be used in the Centre.\n" +
            "\n" +
            "Hasan Âli Yücel Collection Usage Rules \n" +
            "The Hasan Âli Yücel Room is intended primarily for users who need to consult material from the Hasan Âli Yücel Collections.\n" +
            "Books from the Hasan Âli Yücel Collection can only be consulted in the Halil İnalcık Room; they are not circulated and cannot be removed from the room by users.\n" +
            "A maximum of five items will be given to a user at any one time. The user must give his/her ID card to the librarian before being allowed access to the items; the card will be returned to the user when he/she has finished reading the items and after the librarian has checked the item for any damage.\n" +
            "Hasan Âli Yücel Collections material should be handled with care. (In certain cases, the use of special supports, gloves etc. may be required)\n" +
            "Pencils only; no ink pens may be used. The librarian can supply a pencil if required.\n" +
            "Silence must be observed in the Hasan Âli Yücel Room. The use of cellular telephones is not permitted. Readers can use their laptop computers, as long as they do not disturb other users when doing so.\n" +
            "Hasan Âli Yücel Collections materials cannot be photocopied. Digital photographs may be taken, at the discretion of the librarian, as long as the \"flash\" is switched off.\n" +
            "No food or drink (including water) in the Hasan Âli Yücel Room.\n" +
            "*Users who refuse to comply with these rules may be asked to leave the Hasan Âli Yücel Room by the librarian in charge.\n" +
            "Halil Inalcik and Special Collection Usage Rules \n" +
            "The İnalcık Room is intended primarily for users who need to consult material from the İnalcık, Yücel and Special Collections. The Room is designed for individual research and not for group study.\n" +
            "Books from the İnalcık, Yücel and Special Collections can only be consulted in the İnalcık Room; they are not circulated and cannot be removed from the room by users.\n" +
            "A maximum of five items will be given to a user at any one time. The user must give his/her ID card to the librarian before being allowed access to the items; the card will be returned to the user when he/she has finished reading the items and after the librarian has checked the item for any damage.\n" +
            "All İnalcık and Special Collections material should be handled with care. (In certain cases, the use of special supports, gloves etc. may be required)\n" +
            "No food or drink (including water) in the İnalcık Room.\n" +
            "Pencils only; no ink pens may be used. The librarian can supply a pencil if required.\n" +
            "All bags and other possessions (except ladies' handbags) must be left on the special table when entering the İnalcık Room. Coats should be hung on the coat-stand provided.\n" +
            "Silence must be observed in the Halil İnalcık Room. The use of cellular telephones is not permitted. Readers can use their laptop computers, as long as they do not disturb other users when doing so.\n" +
            "İnalcık and Special Collections materials cannot be photocopied. Digital photographs may be taken, at the discretion of the librarian, as long as the \"flash\" is switched off.\n" +
            "*Users who refuse to comply with these rules may be asked to leave the İnalcık Room by the librarian in charge.\n" +
            "\n" +
            "Visually Handicapped Room Usage Rules \n" +
            "The Visually Handicapped Room is open to both visually handicapped members of Bilkent University and also visually handicapped outside users, as well as to those who assist these visually handicapped users. In addition, the Room is open to other researchers without a visually handicapped disability who work on Braille sources.\n" +
            "The Visually Handicapped Room is open on week days between 08:30-17:00, and at weekends between 09:00-17.00.\n" +
            "Braille resources, tape recorders, computers and the printer can only be used in the Visually Handicapped Room itself and cannot be removed from the Room.\n" +
            "The key for the Visually Handicapped Room can be taken from the the reference librarian by depositing your ID card. The key must be returned to library staff when you have finished working in the Room.\n" +
            "Users can use the printer in the Visually Handicapped Room by paying the print-out fee to the Library.\n" +
            "No smoking, eating or drinking (except for water) in the the Library.\n" +
            "\n" +
            "Newspaper and Magazine Reading Room Usage Rules \n" +
            "The Room is open from 08.30 to 23.30 on weekdays for all users.\n" +
            "Printed versions of daily newspapers on weekdays can be found in Newspaper and Magazine Reading Room.\n" +
            "Weekend counts of newspapers are available electronically at http://library.pressdisplay.com/pressdisplay/en/viewer.aspx\n" +
            "Daily newspapers and magazines should not be taken out of the Room.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "Except for water, no food, drink purchased, tobacco products and alcohol should not be consumed in the library.\n" +
            "Workstations Usage Rules \n" +
            "All users can use the computers with internet access.\n" +
            "Computers should be used for educational and research purposes only.\n" +
            "Bilkent University members can log on with their existing usernames and passwords.\n" +
            "Outside users can log on with daily passwords which are given by library staff. Outside users must show their ID to the staff and fill out the relevant form.\n" +
            "Do not “reserve” an occupied workstations for yourself by leaving properties. Workstations left unoccupied for more than 15 minutes may be taken by another user.\n" +
            "Copying files to CDs is not allowed on these computers.\n" +
            "To collect print-outs and copy to CDs, users should contact the photocopy centre in B Block 1st floor, with their usernames.\n" +
            "Computers should not be used to watch DVDs, VCDs etc.\n" +
            "It is prohibited to chat and play games on the computers.\n" +
            "For security reasons, users should log-off before leaving the computers, even for a short while.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "No smoking, eating or drinking in the Library.\n" +
            "Mobile phones may not be used in the Library.\n" +
            "Study Carrels Usage Rules \n" +
            "Administrative Services is responsible for the use of Carrels.\n" +
            "Carrels are for the use of Bilkent University academic staff and graduate students. Empty Carrel will be given to undergraduate students , but if faculty or graduate students apply for Carrel, and empty Carrel is unavailable, undergraduate students is asked to unload the Carrel.\n" +
            "Carrels are given in order of application.\n" +
            "For using carrel, user must apply to Administrative Services and fill the form in order to accept the rules of usage.\n" +
            "Users must pay 20 TL deposit for the carrel key. The deposit fee is determined at the beginning of each semester.\n" +
            "There are 2 keys for each Carrel. One of the keys is provided to the user, the other is kept in the responsible unit.\n" +
            "Carrels can be used for one semester. End of the semester, a reminder is sent to the user with e-mail. Carrels users who want to continue to use, should apply to the responsible unit.\n" +
            "At the end of each semester the deposit is refunded unless an extension is requested.\n" +
            "If user does not bring back the key on time, carrel key will be changed.\n" +
            "Carrels are checked by library staff periodically.\n" +
            "Any library material kept in the cabinet of the carrel must have already been borrowed. Otherwise library materials will be removed from the cabinets by library staff.\n" +
            "If there is no-one else using, carrel can be used by another user until the carrel owner come.\n" +
            "No food or drink in carrels.\n" +
            "Anyone misusing or damaging library materials or premises will be subject to disciplinary measures.\n" +
            "\n" +
            "A Block (2nd Floor) Large Group-Study Rooms Rules \n" +
            "The Large Group Study Rooms can be used on weekdays 8:30-17:00. They are not available at weekends or evenings.\n" +
            "The Rooms may be reserved for up to 3 hours, for a minumum of 6 users.\n" +
            "The room key will only be given by library staff in exchange for the user’s ID card.\n" +
            "The Rooms may not be locked nor left unoccupied without informing the staff member on duty. Otherwise, personal belongings will be removed from the Room by library staff.\n" +
            "In case of loss of a booth key, the user must pay 5 TL in order to receive his/her ID\n" +
            "A Block (2nd Floor) Silent Zone Rules\n" +
            "Please study alone and be silent.\n" +
            "Computers, laptops with keyboard may not be used.\n" +
            "Mobile phones may not be used.\n" +
            "Music/audio clips/mobiles and any personal listening equipment should be inaudible to others.\n" +
            "Space is at a premium - please don't 'reserve' tables leaving your belongings there.\n" +
            "No smoking, eating or drinking in the silent zone.\n" +
            "Orientation Room Usage Rules \n" +
            "Priority of Use:\n" +
            "First priority of the Room will be given to Library-sponsored events.\n" +
            "Second priority will be given to meetings sponsored by academic departments of Bilkent University.\n" +
            "Third priority will be given to students and clubs.\n" +
            "Orientation requests should be made via the online form or via the faculty librarians.\n" +
            "Academic departments and the clubs can use the Room with the approval of the Library's administration.\n" +
            "Any equipment, material, utensils and other items belonging to the Orientation Room must be left in the same condition as found.\n" +
            "No defacing or damaging the Orientation Room, its furniture or equipment in any way (such as posting or mounting materials on walls or doors without permission, painting or writing on any surface).\n" +
            "Noise levels within the Orientation Room should be low and not disruptive to other Library services.\n" +
            "No smoking, and eating in the Orientation Room.\n" +
            "Mobile phones may not be used in the Room.\n" +
            "Bilkent University Library reserves the right to reject any request for Orientation Room use.\n" +
            "The Orientation Room can be reserved on weekdays 8.30-17.00 and at weekends 9.00-17.00 for group video presentation.\n" +
            "The Orientation Room can be reserved for 5 or more users, with a teacher, for a lesson.\n" +
            "For reservation, please complete http://library.bilkent.edu.tr/library-activity-request-form\n" +
            "\n" +
            "Art Gallery Usage Rules \n" +
            "Only members of Bilkent University have the right to request activities in the Art Gallery.\n" +
            "Priority of Use\n" +
            "First priority will be given to Library-sponsored events.\n" +
            "Second priority will be given to meetings sponsored by academic departments of Bilkent University.\n" +
            "Third priority will be given to students and clubs.\n" +
            "Academic departments and the clubs can use the rooms with the approval of the Library administration.\n" +
            "You must complete the Library Activity Request Form for all proposed activities in the Art Gallery.\n" +
            "The Art Gallery can be used on weekdays 8:30-17:00.\n" +
            "Any equipment, material, utensils and other items belonging to the Art Gallery must be left in the same condition as found and the Art Gallery, its furniture or equipment should not be damaged in any way.\n" +
            "Noise levels within the Art Gallery should be low and not disruptive to other Library services.\n" +
            "For any suggestions and questions, please call 290 18 88 or e-mail buildingadm@bilkent.edu.tr\n" +
            "During the FAE presentations periods in every year, the Art Gallery may not be available for other events.\n" +
            "Bilkent University Library reserves the right to reject any request for the Art Gallery.\n" +
            "For mini-concerts and similar loud activities, the Art Gallery can only be used between 12.30-13.30.\n" +
            "\n" +
            "Thesis submission Procedure Of Bilkent University Library\n" +
            "One (1) copy of the printed thesis and one (1) copy of the thesis on CD, along with the following forms, should be delivered to “Reference and Faculty Librarian Office” located on the 1st floor, A Block.\n" +
            "Required Forms:\n" +
            "Bilkent University Library Thesis Database Acceptance and Permission Form. (Accessible at: http://esbe.bilkent.edu.tr/othform.html)\n" +
            "Bilkent University Doctoral and Master’s Students Discharge Form. (Accessible at: http://esbe.bilkent.edu.tr/othform.html)\n" +
            "National Thesis Center ( YÖK) Data Entry and Publishing Permission Form (Accessible at: https://tez.yok.gov.tr/UlusalTezMerkezi/)\n" +
            "Both the printed copy of the thesis and the CD copy will be checked by library staff. Incomplete or incorrect theses will not be accepted and will be returned to the student.\n" +
            "A signed copy of the “National Thesis Center ( YÖK) Data Entry and Publishing Permission Form” should be given to library staff . “Bilkent University Library Thesis Database Acceptance and Permission Form” should be approved and stamped by library staff and will be returned to the student.\n" +
            "After the “Bilkent University Doctoral and Master’s Students Discharge Form” has been initialled by a librarian, it will be returned to the student and taken to the “Circulation Desk”.\n" +
            "Cafe Usage Rules \n" +
            "Except for water, no food and drink purchased at the cafe can be taken into another part of the library building.\n" +
            "Any library materials taken into the cafe must have already been borrowed.\n" +
            "The cafe is not responsible for any lost items.\n" +
            "The cafe is open during the Main Library working hours\n" +
            "For any suggestions, please e-mail libcafe@bilkent.edu.tr";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_rules);

        TextView rules = (TextView) findViewById(R.id.rules_text);
        rules.setText(rulesLibrary);

    }


}

